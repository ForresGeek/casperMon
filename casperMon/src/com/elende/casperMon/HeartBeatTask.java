package com.elende.casperMon;

import net.imed_portal.MonitorSoap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class HeartBeatTask implements Runnable {
	
	public static final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.heartbeattask");
	
	private MonitorSoap proxy = null;	
	
	
	public MonitorSoap getProxy() {
		return proxy;
	}


	public void setProxy(MonitorSoap proxy) {
		this.proxy = proxy;
	}

	private String wsdl="";
	private String username="";
	private String pwd="";
		


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	public HeartBeatTask(MonitorSoap sp,String username,String pwd)
	{
		//Read my init properties.
		 	System.out.println("HeartBeat Task Init");
			
			this.setPwd(pwd);
			this.setUsername(username);
			this.setProxy(sp);
		 
		 
	}
	
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		CImedWrapper wrapper = new CImedWrapper(this.getProxy(), this.getUsername(), this.getPwd());
		
		boolean bServiceAvailable = false;
		boolean bReportingAvailable = false;
		
		
		try{
			
			bServiceAvailable = wrapper.CheckServiceAvailable();
			LOGGER.debug("Service Available"+bServiceAvailable);
			
			bReportingAvailable = wrapper.CheckReportingAvailable();
			LOGGER.debug("Reporting Available"+bReportingAvailable);
			
			
		} catch(Exception ex) {
			LOGGER.error("Error in Imed Calls",ex);
		}

		
		if(bServiceAvailable && bReportingAvailable)
		{

			 boolean ret= wrapper.PutHeartBeat();
			 LOGGER.debug("HEARTBEAT: "+String.valueOf(ret));
			
		}
		
		
		
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Skeleton finalize");
		super.finalize();
	}
	
	
	



}
