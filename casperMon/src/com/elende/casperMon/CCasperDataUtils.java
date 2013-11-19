package com.elende.casperMon;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class CCasperDataUtils {

	public  final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.CCasperDataUtils"); 
	
	/*
	 * Connect to MySQL database (CasPer), and run various queries.
	 * 
	 * 
	 */
	
	
	Connection conn = null;
	boolean isConnected = false;
	String connectionString = "";	

	public boolean Connect(String cString) throws SQLException
	{
		try {
			this.connectionString = cString;
			LOGGER.debug("Connecting to:"+cString);
			conn =	 DriverManager.getConnection(this.connectionString);
			this.isConnected = true;
		} catch (SQLException ex) {
		    // handle any errors
			LOGGER.error("Error connecting to MySQL",ex);
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    throw ex;
		}
		
		return this.isConnected;
	
	}
	
	
	
	
	
	
	

	public boolean Disconnect() throws SQLException
	{
		try {
			LOGGER.debug("Disconnecting:"+connectionString);
			
			if (conn!=null)
					 conn.close();
		
			this.isConnected = false;
			
			
		} catch (SQLException ex) {
		    // handle any errors
			LOGGER.error("Error disconnecting MySQL",ex);
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    throw ex;
		}
		
	
		
		return this.isConnected;
		
		
	}

	
	
	
		
	
	
	
	public  int GetReferralsIn()
	{

		//select count(*) from Request where received > CURRENT_TIMESTAMP - INTERVAL 1 DAY;
		//conn.
		
		
		return 99;
	}
	
	
	public  int GetReferralsLastHour()
	{
	
		return 99;
	}

	
	public  int GetPatientsIn()
	{
		
		//select count(*) from Patient;
		
		
	
		return 99;
	}
	
	
	public static int GetInRefNum()
	{
	
		
		
		
		return 99;
	}
	
	
	public  int GetRegisteredUsers()
	{
	
		
		//select count(*) from Access_SYS where enabled=1
		
				
		//select count(distinct(userid)) from login_SYS where instant > CURRENT_TIMESTAMP - INTERVAL 1 HOUR;
		
		return 99;
	}
	
	

	public  int GetActiveUsersLastHour()
	{
		//select count( distinct(`who`)) from auditTrail_SYS where `when` > CURRENT_TIMESTAMP - INTERVAL 1 HOUR ;

		return 99;
	}
	
	
	
	
}










