package com.elende.casperMon;

import net.imed_portal.MonitorSoap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class HeartBeatTask extends ScheduledTask {
	
	
	
	public HeartBeatTask(MonitorSoap sp, String username, String pwd) {
		this.setProxy(sp);
		this.setUsername(username);
		this.setPwd(pwd);
	}

	@Override
	public void run() {
	
		
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
		else
		{
			LOGGER.info("Service / Reporting NOT available: "+bServiceAvailable+" "+bReportingAvailable);
		}		
	}


}
