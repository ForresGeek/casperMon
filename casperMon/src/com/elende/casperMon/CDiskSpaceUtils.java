package com.elende.casperMon;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;


public class CDiskSpaceUtils {


	public static final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.CDiskSpaceUtils"); 
	
	
	public static String[] GetFileSystemList()
	{
		 String sDisk[]	= new String[]{"/","","","",""} ;
		 LOGGER.debug("Read CDiskSpaceUtil Properties");

		 try{
		 Configuration config = new PropertiesConfiguration("caspermon.properties");
		 
		
		 for(int i=0 ; i<6 ; i++)
		 {
			 if(config.containsKey("diskutils.DISK"+String.valueOf(i)))
			 {
				 sDisk[i] = config.getString("diskutils.DISK"+String.valueOf(i),"");
				 LOGGER.trace("DISK"+String.valueOf(i)+":"+sDisk[i]);
			 }
		 
		 }
		 	
		 }
		 catch (ConfigurationException cex)
		 {
			 LOGGER.fatal("Error getting CDiskSpaceUtils config",cex); 
		 }
		return sDisk;

	}
	
	
	public static String GetDiskSpace(String sPath) 
	{
		String sSpace="";

		if (sPath =="") return sPath;
		
		try{
			long freeSpaceInKB = FileSystemUtils.freeSpaceKb(sPath);
			long freeSpaceInGB = freeSpaceInKB / FileUtils.ONE_MB;
			sSpace = Long.toString(freeSpaceInKB)+"Kbytes";
			} 
		
		catch (IOException e) {
				e.printStackTrace();

		}
		
		return sSpace;
	}
	
	
	
	
	
	
	
	
}
