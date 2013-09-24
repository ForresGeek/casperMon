package com.elende.casperMon;

import net.imed_portal.Monitor;
import net.imed_portal.MonitorSoap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SkeletonTask implements Runnable {
	
	public static final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.skeletontask");
	
	
	private final Monitor mon  = new Monitor();
	private MonitorSoap sp = null;			//SOAP Proxy
	
	public void SkeletonTask(int pollInterval)
	{
		//Read my init properties.
		
		
		 System.out.println("Skeleton Task Init");
		 
		 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Beep");
		boolean bReporting = false;
		boolean bService = false;
		
		
		
		sp = mon.getMonitorSoap();
		
		 bReporting = sp.isREPORTINGAVAILABLE(inREFNUMIN);

		 sp.
		 
		 
		if (bReporting)
		{
		 
			bService = sp.isSERVICEAVAILABLE(inREFNUMIN)
		
		}
		
		
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Skeleton finalize");
		super.finalize();
	}
	
	
	



}
