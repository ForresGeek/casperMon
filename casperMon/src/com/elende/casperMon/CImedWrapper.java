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
	
	
	
	public boolean PutHeartBeat()
	{
		boolean bRet=false;
		try{
		LOGGER.trace("Sending Heartbeat");
		bRet = proxy.putHEARTBEATPULSE(this.getUsername());
		}
		catch(Exception ex)
		{
			LOGGER.error("Error sending Heartbeat",ex);
		}
		return bRet;
	}
	
	
	
	public boolean PutStatusCheck()
	{
		boolean bRet=false;
		try{
		LOGGER.trace("Sending Status");
		
		
		//gather facts & figures for the status check/
		
		
		String sFileSystems[] = CDiskSpaceUtils.GetFileSystemList();
		String sTemp = CTemp.GetSystemTemperature();
		String sUpTime = CUpTime.GetSystemUpTime();
		
		String sPatientsIN = String.valueOf(CCasperDataUtils.GetPatientsIn());
		String sReferralsIN = String.valueOf(CCasperDataUtils.GetReferralsIn());
		String sReferralsLastHour = String.valueOf(CCasperDataUtils.GetReferralsLastHour());
		
		
		String sUsers = String.valueOf(CUpTime.GetUsers());
		String sUsersLastHour = String.valueOf(CUpTime.GetUsersLastHour());
		
		String[] sDisk = new String[]{ CDiskSpaceUtils.GetDiskSpace(sFileSystems[0]),CDiskSpaceUtils.GetDiskSpace(sFileSystems[1]),CDiskSpaceUtils.GetDiskSpace(sFileSystems[2]),CDiskSpaceUtils.GetDiskSpace(sFileSystems[3]),CDiskSpaceUtils.GetDiskSpace(sFileSystems[4])};
		

			String logMessage = String.format("DISK0: %s\nDISK1: %s\nDISK2: %s\nDISK3: %s\nDISK4: %s\nTemp: %s\nUptime: %s\nPatients: %s\nReferrals: %s\nReferrals Last Hour: %s\nUsers: %s\nUsers Last Hour: %s", sDisk[0],sDisk[1],sDisk[2],sDisk[3],sDisk[4], sTemp, sUpTime, sPatientsIN, sReferralsIN, sReferralsLastHour, sUsers, sUsersLastHour);
		
			LOGGER.debug("Status Check:" + logMessage);
		
			bRet = proxy.putSTATUSCHECKPACKET(username, sDisk[0],sDisk[1],sDisk[2],sDisk[3],sDisk[4], sTemp, sUpTime, sPatientsIN, sReferralsIN, sReferralsLastHour, sUsers, sUsersLastHour);

			
		}
		catch(Exception ex)
		{
			LOGGER.error("Error sending Heartbeat",ex);
		}
		return bRet;
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
