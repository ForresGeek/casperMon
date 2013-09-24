package com.elende.casperMon;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCUpTime {

	@Test
	public void testGetSystemUpTime() {
		
	String luptime = CUpTime.GetSystemUpTime();
	System.out.println("Uptime:"+luptime);
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
