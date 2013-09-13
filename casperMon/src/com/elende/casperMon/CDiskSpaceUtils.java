package com.elende.casperMon;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import java.io.IOException;




public class CDiskSpaceUtils {


	public String GetDiskSpace(String sPath) 
	{
		String sSpace="";

		try{
			long freeSpaceInKB = FileSystemUtils.freeSpaceKb(sPath);
			long freeSpaceInGB = freeSpaceInKB / FileUtils.ONE_MB;
			} 
		
		catch (IOException e) {
				e.printStackTrace();

		}
		
		return sSpace;
	}
	
}
