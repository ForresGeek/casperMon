///
/// Class to get "uptime" figures from the CasPer server.
///
/// how long's it been up, how many users etc.
///
///

package com.elende.casperMon;

import java.io.FileInputStream;
import java.util.Scanner;

public class CUpTime {

	
	 public static long GetSystemUpTime()
	 {
		 long upTime=0L;
		 //try to get uptime from /proc/uptim eon LInux
		 try
		 {

			 //Only works on Linux... expect exception otherwise..
			 upTime = Long.parseLong(new Scanner(new FileInputStream("/proc/uptime")).next());
			//"1128046.07" on my machine and still counting	 
		 }
		 catch(Exception ex)
		 {
			 upTime = System.nanoTime();
		 }
		 
		return upTime;
	 
	 }
	 
	 
	 
	 
	 
	 
	 
	 public static int GetUsers()
	 {
	 
		 return 99;
	 }
	 
	 
	 
	 
	 
	 public static int  GetUsersLastHour()
	 {
	 
		 return 99;
	 }
}
