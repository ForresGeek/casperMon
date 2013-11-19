package com.elende.casperMon;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCCasperDataUtils {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws SQLException {
		
		String connectionString = "jdbc:mysql://localhost/casper_3?user=public&password=readonly";
		CCasperDataUtils casper = new CCasperDataUtils();
		try {
			casper.Connect(connectionString);
		} catch (SQLException e) {
			fail("No Connection"); // TODO
			e.printStackTrace();
		}
		
		if(casper.isConnected){
			 casper.Disconnect();
		}else
		{
		}
	}

}
