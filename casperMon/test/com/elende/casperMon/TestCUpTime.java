package com.elende.casperMon;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCUpTime {

	@Test
	public void testGetSystemUpTime() {
		
	long luptime = CUpTime.GetSystemUpTime();
	System.out.println("Uptime:"+Long.toString(luptime));
	//assert.assertTrue(    luptime > 37000L);
	
	}

	@Test
	public void testGetUsers() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetUsersLastHour() {
		fail("Not yet implemented"); // TODO
	}

}
