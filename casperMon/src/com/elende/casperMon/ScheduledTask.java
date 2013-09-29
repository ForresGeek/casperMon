package com.elende.casperMon;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import net.imed_portal.MonitorSoap;

public abstract class ScheduledTask implements Runnable{
	
	public static final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.scheduledtask");
	
	private MonitorSoap proxy = null;

	public abstract void run();

	private String wsdl = "";

	
	public ScheduledTask(MonitorSoap sp,String username,String pwd)
	{
		//Read my init properties.
		 	System.out.println("Scheduled Task Init");
			
			this.setPwd(pwd);
			this.setUsername(username);
			this.setProxy(sp);
	}
	
	
	public MonitorSoap getProxy() {
		return proxy;
	}

	public void setProxy(MonitorSoap proxy) {
		this.proxy = proxy;
	}

	private String username = "";
	private String pwd = "";

	public ScheduledTask() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}