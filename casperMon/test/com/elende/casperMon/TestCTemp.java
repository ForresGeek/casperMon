package com.elende.casperMon;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCTemp {


	@Test
	public void testGetSystemTemperature() {
		String sTemp  = CTemp.GetSystemTemperature();
		System.out.println(sTemp);
		assertTrue(sTemp.length()>0);
	}
}
