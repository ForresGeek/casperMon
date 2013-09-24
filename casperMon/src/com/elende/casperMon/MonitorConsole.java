package com.elende.casperMon;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import net.imed_portal.Monitor;
import net.imed_portal.MonitorSoap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;


public class MonitorConsole {

	static Properties props;
	public static final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.monitorconsole"); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		String wsdl = "http://www.imed-portal.net/cievert_monitor_ws/monitor.asmx?wsdl";
		String username = "CIEVERT001";
		String pwd ="cievert001";
		
		int iStatusCheck = 5;
		int iHeartBeat = 5;
		
		boolean bLoggedIn = false;
		boolean bReportingAvailable =false;
		boolean bServiceAvailable =false;
		
		
		props = readProperties();
		
		if (props!=null){
			 LOGGER.debug("Read Properties");
			 wsdl = props.getProperty("heridian.wsdl","http://www.imed-portal.net/cievert_monitor_ws/monitor.asmx?wsdl");
			 username = props.getProperty("heridian.systemId","CIEVERT001");
			 pwd = props.getProperty("heridian.pwd","cievert001");		
		}
		else
		{
		 LOGGER.warn("Failed to read props file - using defaults");
		}
		
		
		
		
			try {
					Monitor monitor = new Monitor(new java.net.URL(wsdl));
					MonitorSoap sp = monitor.getMonitorSoap();
		
				
					CImedWrapper imed = new CImedWrapper(sp,username,pwd);
				
					bServiceAvailable = imed.CheckServiceAvailable();
					LOGGER.info("Service Available:"+bServiceAvailable);
				
					bReportingAvailable = imed.CheckReportingAvailable();
					LOGGER.info("Reporting Available:"+bReportingAvailable);
					
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Malformed URL", e);
				e.printStackTrace();
			}
			
	
		
		
		
		/*
		
		
		     final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		     final SkeletonTask pollTask = new SkeletonTask();

		   
		        final ScheduledFuture<?> pollHandler =
		            scheduler.scheduleAtFixedRate(pollTask, 10, 10, java.util.concurrent.TimeUnit.SECONDS);
		     
		        System.out.println("Task Scheduled");
		        
		        scheduler.schedule(new Runnable() {
		                public void run() { System.out.println("Killing Poller"); pollHandler.cancel(true); }
		            }, 2 * 60, java.util.concurrent.TimeUnit.SECONDS);
		
		        System.out.println("Terminator Scheduled");
		*/
	}

	
	

	

	
	
	
	
	
	private static Properties readProperties() 
	{
		
		LOGGER.debug("Reading props file");
		Properties props =null;
		
		try{
			
	
		//load a properties file from class path, inside static method
			props.load(App.class.getClassLoader().getResourceAsStream("/casperMon/caspermon.properties"));
			props.list(System.out);
		}
		catch(Exception ex)
		{
			LOGGER.error("can't find props file",ex);
			props = null;
		}
		return props;
		
	}
}
	
	
	
