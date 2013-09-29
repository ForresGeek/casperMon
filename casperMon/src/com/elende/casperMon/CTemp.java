package com.elende.casperMon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class CTemp {
	

	public static final String ACPITEMP = "//sys//bus//acpi//devices//LNXTHERM:00//thermal_zone//temp";
	public static final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.CTemp"); 

	
	
	public static String GetSystemTemperature()
	{
	
		//Not the most scientific way of getting the system temperature...
		// But should work for most Linux.
		String sTemp="N/A";
	
		try{
		File file = new File(ACPITEMP);
		BufferedReader fr = new BufferedReader(new FileReader(file));
		
		sTemp = fr.readLine();
		LOGGER.debug("Temp:"+sTemp);
		}
		catch(Exception ex)
		{
			LOGGER.error("Can't read CPU temp",ex);
			sTemp = "N/A";
		}
	
	
		return sTemp;
	}

}
