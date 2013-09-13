package com.elende.casperMon;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCDiskSpaceUtils {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testDiskSpace() {
		
		String sSpace = CDiskSpaceUtils.GetDiskSpace("/Users");
		
		System.out.println("space:"+sSpace);
	}

}
