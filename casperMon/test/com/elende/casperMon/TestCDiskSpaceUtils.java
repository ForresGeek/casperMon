package com.elende.casperMon;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCDiskSpaceUtils {

	@Test
	public void testDiskSpace() {
		
		String sSpace = CDiskSpaceUtils.GetDiskSpace("/Users");
		assertTrue(sSpace!="");
		assertTrue(sSpace.matches("\\d+\\s+"));
		System.out.println("space:"+sSpace);
	}

	
	@Test
	public void testGetFileSystemList()
	{
		String[] filesystems = CDiskSpaceUtils.GetFileSystemList();
		assertTrue(filesystems.length==5);
		assertTrue(filesystems[0]=="/");
		assertTrue(filesystems[2]=="/var");
	}
	
}
