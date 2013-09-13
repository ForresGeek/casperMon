package com.elende.casperMon;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;


public class MonitorConsole {

	static Properties props;
	public static final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.monitorconsole"); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		props = readProperties();
		
		if (props!=null){
		
			//Set some properties and 
			
			
			//Connect to Heridian and get my config
			
			LOGGER.info("Connecting to Heridian");
			
		
	
			
		
		}
	}

	
	
	
	
	
	private static Properties readProperties() 
	{
		
		LOGGER.debug("Reading props file");
		Properties props =null;
		
		try{
		//load a properties file from class path, inside static method
		props.load(MonitorConsole.class.getClassLoader().getResourceAsStream("config.properties"));
		props.list(System.out);
		}
		catch(Exception ex)
		{
			LOGGER.fatal("can't find props file");
			props = null;
		}
		return props;
		
	}
}
	
	
	
	
	
	
	
}
