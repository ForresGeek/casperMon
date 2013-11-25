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


public class DBConnectivity {

	static Properties props;
	public static final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.DBConnectivity"); 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		CCasperDataUtils casper = new CCasperDataUtils();
		
		try
		{
		
			int usersLastHour = casper.GetActiveUsersLastHour();
			LOGGER.info("UsersLastHour:"+String.valueOf(usersLastHour));
		
			int patientsIn = casper.GetPatientsIn();
			LOGGER.info("PatientsIn:"+ String.valueOf(patientsIn));
		
			int referralIn = casper.GetReferralsIn();
			LOGGER.info("referralIn:"+ String.valueOf(referralIn));
			
			
			int referralsLastHour =casper.GetReferralsLastHour();
			LOGGER.info("ReferralsLastHour:"+String.valueOf(referralsLastHour));
			
			int registeredUsers  =casper.GetRegisteredUsers();
			LOGGER.info("RegisteredUsers:" + String.valueOf(registeredUsers));
		}
		catch(Exception ex)
		{
			LOGGER.error("DB Problems", ex);
		}

	    return;
	}

}
	
	
	
