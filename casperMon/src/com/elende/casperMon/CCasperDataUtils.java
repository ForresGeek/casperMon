package com.elende.casperMon;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class CCasperDataUtils {

	public final Logger LOGGER =LogManager.getLogger("com.elende.caspermon.CCasperDataUtils"); 
	
	/*
	 * Connect to MySQL database (CasPer), and run various queries.
	 */
	
	Connection conn = null;
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public boolean isConnected() {
		return isConnected;
	}

	public void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}

	public String getSkeletonconnectionString() {
		return skeletonconnectionString;
	}

	public void setSkeletonconnectionString(String skeletonconnectionString) {
		this.skeletonconnectionString = skeletonconnectionString;
	}

	public String getWebDB() {
		return webDB;
	}

	public void setWebDB(String webDB) {
		this.webDB = webDB;
	}

	public String getCasperDB() {
		return casperDB;
	}

	public void setCasperDB(String casperDB) {
		this.casperDB = casperDB;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	boolean isConnected = false;
	String skeletonconnectionString = "";
	String webDB = "";
	String casperDB = "";
	String host = "";
	String user="";
	String pwd="";

	
	public CCasperDataUtils()
	{		
		try{
			 Configuration config = new PropertiesConfiguration("caspermon.properties");
			 
			 skeletonconnectionString = config.getString("casper.connection","jdbc:mysql://%s/%s?user=%s&password=%s");
			 host = config.getString("casper.host","localhost");
			 casperDB = config.getString("casper.casperDB","casper_3");
			 webDB = config.getString("casper.webDB","mywebif_4");		
			 user = config.getString("casper.user","public");
			 pwd = config.getString("casper.pwd","readonly");
			
			 
			 }
			 catch (ConfigurationException cex)
			 {
				 LOGGER.fatal("Can't get config",cex);
			 }
	      try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	private boolean Connect(String cString) 
	{
		String connectionString ="";
		try {
			connectionString = cString;
			LOGGER.debug("Connecting to:"+cString);
			
			
			conn = (Connection) DriverManager.getConnection(connectionString);
			this.isConnected = true;
		} catch (SQLException ex) {
		    // handle any errors
			LOGGER.error("Error connecting to MySQL",ex);
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    this.isConnected = false;
		 }
		
		return this.isConnected;
	
	}	
	
	public boolean Disconnect()
	{
		try {
			LOGGER.debug("Disconnecting: DB");
			
			if (conn!=null)
					 conn.close();
		
			this.isConnected = false;
			
			
		} catch (SQLException ex) {
		    // handle any errors
			LOGGER.error("Error disconnecting MySQL",ex);
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		return this.isConnected;	
	}

	
	//Get number of referrals (Requests) 
	// return -1 if a problem.
	public int GetReferralsIn()
	{
		String sQuery = "	select count(*) from Request ;";
		String connectionString = String.format(this.skeletonconnectionString,this.host,this.casperDB,this.user,this.pwd);
		int iRet = -1;
		
		iRet =  this.getIntResult(connectionString, sQuery);

		return iRet;
	}
		
	public  int GetReferralsLastHour()
	{
		String sQuery = "select count(*) from Request where Received > CURRENT_TIMESTAMP - INTERVAL 1 DAY;";
		String connectionString = String.format(this.skeletonconnectionString,this.host,this.casperDB,this.user,this.pwd);
		int iRet = -1;
		iRet =  this.getIntResult(connectionString, sQuery);
		return iRet;
	}

	public  int GetPatientsIn()
	{
		String sQuery="select count(*) from Patient;";
		String connectionString = String.format(this.skeletonconnectionString,this.host,this.casperDB,this.user,this.pwd);
		int iRet = -1;
		iRet =  this.getIntResult(connectionString, sQuery);
		return iRet;
	}
		
	public static int GetInRefNum()
	{
	
		
		
		
		return 99;
	}
	
	public  int GetRegisteredUsers()
	{
		String sQuery="select count(*) from Access_SYS where enabled=1;";
		String connectionString = String.format(this.skeletonconnectionString,this.host,this.casperDB,this.user,this.pwd);
		int iRet = -1;
		iRet =  this.getIntResult(connectionString, sQuery);
		return iRet;
	
	}
	
	public  int GetActiveUsersLastHour()
	{
		String sQuery="select count(distinct(userid)) from login_SYS where instant > CURRENT_TIMESTAMP - INTERVAL 1 HOUR;";
		String connectionString = String.format(this.skeletonconnectionString,this.host,this.webDB,this.user,this.pwd);
		int iRet = -1;
		iRet =  this.getIntResult(connectionString, sQuery);
		return iRet;
	}
	

	
	private int getIntResult(String connectionString,String query)
	{
		int iRet =-1;
		//connect
		if (this.Connect(connectionString))
			{			
		  	try {
		  		  PreparedStatement  stmt = (PreparedStatement) conn.serverPrepareStatement(query);
				  ResultSet rs = stmt.executeQuery();
				  iRet= rs.getInt(0);
				  rs.close();					   
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					LOGGER.error("Error running query", e);
					e.printStackTrace();
					//throw e;
				}
		  this.Disconnect();
			}
		return iRet;	
	}
}










