package com.elende.casperMon;

import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import net.imed_portal.Monitor;
import net.imed_portal.MonitorSoap;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class MonitorConsole {

	static Properties props;
	public static final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.monitorconsole"); 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	 	final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
		  
		
		String wsdl = "http://www.imed-portal.net/cievert_monitor_ws/monitor.asmx?wsdl";
		String username = "CIEVERT001";
		String pwd ="cievert001";
		
		int iStatusCheck = 5;
		int iHeartBeat = 5;
		
		boolean bLoggedIn = false;
		boolean bReportingAvailable =false;
		boolean bServiceAvailable =false;
		int iRetries = 5;
		MonitorSoap sp = null;

			 LOGGER.debug("Read Properties");
			 
			 try{
			 Configuration config = new PropertiesConfiguration("caspermon.properties");
			 
			 wsdl = config.getString("heridian.wsdl","http://www.imed-portal.net/cievert_monitor_ws/monitor.asmx?wsdl");
			 username = config.getString("heridian.systemId","CIEVERT001");
			 pwd = config.getString("heridian.pwd","cievert001");		
			 
			
			 
			 }
			 catch (ConfigurationException cex)
			 {
				 LOGGER.fatal("Can't get config",cex);
				 return ;
			 }
	
			 
	
			 boolean bInit =false;
			 
			 while (!bInit && iRetries > 0 ){
			 
			 try {
					
					Monitor monitor = new Monitor(new java.net.URL(wsdl));
					sp = monitor.getMonitorSoap();
	
					
					CImedWrapper imed = new CImedWrapper(sp,username,pwd);
						
					//Check if service is available
					bServiceAvailable = imed.CheckServiceAvailable();
					LOGGER.info("Service Available:"+bServiceAvailable);
				
					//Check if reporting is available
					bReportingAvailable = imed.CheckReportingAvailable();
					LOGGER.info("Reporting Available:"+bReportingAvailable);
			
					//If Service is available, and reporting is available, then get the heartbeat and status check interval
					
					if(bServiceAvailable && bReportingAvailable)
					{
					
						try{
							iStatusCheck = imed.GetStatusCheckFreq();
							iStatusCheck = 15;
							LOGGER.debug("Status check:"+String.valueOf(iStatusCheck));
					
					
							
							iHeartBeat = imed.GetHeartBeatFreq();
							iHeartBeat = 5;
							LOGGER.debug("Heartbeat:"+String.valueOf(iHeartBeat));
					
							bInit = true;
						}
						catch(Exception ex)
						{
							LOGGER.error("Error getting intervals",ex);
							bInit = false;
						}
					}
			 	} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Malformed URL", e);
				e.printStackTrace();
				}
			
			  if(!bInit)
			  {
				  iRetries = iRetries -1
						  ;
				  LOGGER.info("failed to connect to IMed, retrying....."+ String.valueOf(iRetries));
				  Thread.sleep(60*1000);
			  }
			 
	
			 }
			 
			 
			 if(bInit)
			 {
			  LOGGER.debug("Initialized,scheduling daemons");
			 
			  	 	HeartBeatTask hb = new HeartBeatTask(sp,username,pwd);
			        final ScheduledFuture<?> hbHandler = scheduler.scheduleAtFixedRate(hb, iHeartBeat, iHeartBeat, java.util.concurrent.TimeUnit.SECONDS);
			     
			        System.out.println("HeartBeat Task Scheduled");
			        
			        StatusTask sb = new StatusTask(sp,username,pwd);
			        final ScheduledFuture<?> statHandler = scheduler.scheduleAtFixedRate(sb, iStatusCheck, iStatusCheck, java.util.concurrent.TimeUnit.SECONDS);
			        System.out.println("StatusCheck Task Scheduled");
		
			        
			        scheduler.schedule(new Runnable() {
		                		public void run() { System.out.println("Killing Poller"); statHandler.cancel(false); hbHandler.cancel(false); scheduler.shutdown();  }
		            },  60, java.util.concurrent.TimeUnit.SECONDS);

	
			   
			      if(scheduler.isShutdown())
			      {
			    	  bInit = false;
			    	  iRetries = 5;
			      }
			        
			 }
			 
			 else
			 {
				 LOGGER.info("Failed to intialize after retries.... exiting");
				 return;
			 }
			 
			 LOGGER.debug("Exiting.....");
			 return;
	}

			 
		
		
		/*
		     
		        scheduler.schedule(new Runnable() {
		                public void run() { System.out.println("Killing Poller"); pollHandler.cancel(true); }
		            }, 2 * 60, java.util.concurrent.TimeUnit.SECONDS);
		
		        System.out.println("Terminator Scheduled");
		*/
	
	
	
	
	
}
	
	
	
