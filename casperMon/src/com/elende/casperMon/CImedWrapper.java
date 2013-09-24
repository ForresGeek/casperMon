package com.elende.casperMon;
///
/// Simple wrapper class for Imed web-methods
/// 
///

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import net.imed_portal.MonitorSoap;



public class CImedWrapper {

	private Logger LOGGER;
	
	private String username ="";
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public MonitorSoap getProxy() {
		return proxy;
	}

	public void setProxy(MonitorSoap proxy) {
		this.proxy = proxy;
	}

	private String password="";
	private MonitorSoap proxy = null;
	
	
	public CImedWrapper(MonitorSoap sp,String username, String pwd)
	{
		
		LOGGER = LogManager.getLogger("com.elende.caspermon.CImedWrapper"); 
		this.setProxy(sp);
		this.setUsername(username);
		this.setPassword(pwd);
	
	}
	
	public  boolean CheckReportingAvailable()
	{

		boolean bRet = false;
		
		try{
		 bRet = proxy.isREPORTINGAVAILABLE(username);
		}
		catch(Exception ex)
		{
			LOGGER.error("CheckReportingAvailable",ex);
			bRet = false;
		}
		return bRet;
	
	}
	
	
	
	public  int GetHeartBeatFreq()
	{
		int iRet = -1;
		
		try{
		 iRet = proxy.getHEARTBEATFREQUENCY(getUsername());
		}
		catch(Exception ex)
		{
			LOGGER.error("GetHeartBeatFreq",ex);
			iRet = -1;
		}
	
	return iRet;
	
	}
	
	
	public  int GetStatusCheckFreq()
	{
	int iRet = -1;
		
		try{
		 iRet = proxy.getSTATUSCHECKFREQUENCY(getUsername());
		}
		catch(Exception ex)
		{
			LOGGER.error("GetStatusCheckFreq",ex);
			iRet = -1;
		}
		return iRet;
	}
	
	
	
	
	public  boolean CheckServiceAvailable()
	{
		boolean bRet = false;
		
		try{
		 bRet = proxy.isSERVICEAVAILABLE(username);
		}
		catch(Exception ex)
		{
			LOGGER.error("CheckServiceAvailable",ex);
			bRet = false;
		}
		return bRet;
	}
	
	
	
	public boolean LogIn()
	{
		boolean bRet = false;
	
		try{
			bRet = proxy.loggedIN(username,password);
		}
		catch(Exception ex)
		{
			LOGGER.error("Login",ex);
			bRet = false;
		}
		return bRet;
	}
	
	




}
