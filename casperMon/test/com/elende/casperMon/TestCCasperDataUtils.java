package com.elende.casperMon;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestCCasperDataUtils {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Ignore
	@Test
	public void testConfig() throws SQLException {
		CCasperDataUtils casper = new CCasperDataUtils();		
		Assert.assertTrue("Host",casper.getHost()=="localhost");
		Assert.assertTrue("User",casper.getUser()=="public");
		Assert.assertTrue("Pwd",casper.getPwd()=="readonly");
		Assert.assertTrue("WebDB",casper.getWebDB()=="mywebif_4");
		Assert.assertTrue("CasperDB",casper.getCasperDB()=="casper_3");
	}
	
	
	
    @Ignore	
	@Test
	public void testUsersLastHour() throws SQLException {
	
		CCasperDataUtils casper = new CCasperDataUtils();
		
		int i = casper.GetActiveUsersLastHour();
		Assert.assertTrue("Active users last hour",i >= 0);
		Assert.assertFalse("Disconnected:",casper.isConnected());
	}
	
    
    
    
	@Ignore
	@Test
	public void testReferralsLastHour() throws SQLException {
	
		CCasperDataUtils casper = new CCasperDataUtils();
		
		int i = casper.GetReferralsLastHour();
		Assert.assertTrue("Referrals last hour",i >= 0);
		Assert.assertFalse("Disconnected:",casper.isConnected());
	}
	
	

	@Ignore
	@Test
	public void testReferrals() throws SQLException {
	
		CCasperDataUtils casper = new CCasperDataUtils();
		
		int i = casper.GetReferralsIn();
		Assert.assertTrue("Total Referrals:",i >= 0);
		Assert.assertFalse("Disconnected:",casper.isConnected());
	}
	
	

	
	@Ignore
	@Test
	public void testRegisteredUsers() throws SQLException {
	
		CCasperDataUtils casper = new CCasperDataUtils();
		
		int i = casper.GetRegisteredUsers();
		Assert.assertTrue("Registered users:",i >= 0);
		Assert.assertFalse("Disconnected:",casper.isConnected());
	}
	

}
