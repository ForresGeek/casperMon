package com.elende.casperMon;

import net.imed_portal.MonitorSoap;

public class StatusTask extends ScheduledTask {
	
	
	public StatusTask(MonitorSoap sp, String username, String pwd) {
		// TODO Auto-generated constructor stub
	
		this.setProxy(sp);
		this.setUsername(username);
		this.setPwd(pwd);
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
			// Collect facts & figures
			
		  boolean ret =  wrapper.PutStatusCheck();
		  LOGGER.debug("STATUSCHECK: "+String.valueOf(ret));
			
		}
		else
		{
			LOGGER.info("Service / Reporting NOT available: "+bServiceAvailable+" "+bReportingAvailable);
		}
		
		
		
	}
}
