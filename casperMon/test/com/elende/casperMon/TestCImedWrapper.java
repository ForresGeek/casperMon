package com.elende.casperMon;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import net.imed_portal.Monitor;
import net.imed_portal.MonitorSoap;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestCImedWrapper {
	
	private static String wsdl = "http://www.imed-portal.net/cievert_monitor_ws/monitor.asmx?wsdl";
	private static String username = "CIEVERT001";
	private static String pwd ="cievert001";

	
	CImedWrapper wrapper;

	
	@Before
	public void setupWrapper()
	{
		
		Monitor monitor = null;
		try {
			monitor = new Monitor(new java.net.URL(wsdl));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MonitorSoap sp = monitor.getMonitorSoap();
		wrapper = new CImedWrapper(sp,username,pwd);
		
	}
	
	

	@Test
	public void testCheckReportingAvailable() {
		assertTrue(wrapper.CheckReportingAvailable());
	}

	@Test
	public void testGetHeartBeatFreq() {

		
		int ifreq = wrapper.GetHeartBeatFreq() ;
		System.out.println("Heartbeat:"+ifreq);
		assertTrue(ifreq > 5);

	}

	@Test
	public void testGetStatusCheckFreq() {
		
		int ifreq = wrapper.GetStatusCheckFreq() ;
		System.out.println("StatusCheck:"+ifreq);
		assertTrue(ifreq> 5);

	}

	@Test
	public void testCheckServiceAvailable() {
		assertTrue(wrapper.CheckServiceAvailable());
	}

	@Ignore("Not sure about the need to Login")
	public void testLogIn() {
		assertTrue(wrapper.LogIn());

	}

}
