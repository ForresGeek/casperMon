package com.elende.casperMon;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCUpTime {

	@Test
	public void testGetSystemUpTime() {
		
	String luptime = CUpTime.GetSystemUpTime();
	System.out.println("Uptime:"+luptime);
	Assert.assertTrue(luptime.length()>0);
	//assert.assertTrue(    luptime > 37000L);
	
	}


}
