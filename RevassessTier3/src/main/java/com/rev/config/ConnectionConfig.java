package com.rev.config;

import java.sql.*;

/**
 * 
 * @author Revature
 *
 *This is a paceholder class to hold the configurations of your db connection.
 *You should change the url, username, and password. DO NOT CHANGE 
 *THE MODIFIERS OR THE NAMES OF THE VARIABLES. These are 
 *used to test your db schema. 
 */
public class ConnectionConfig {
	//add your jdbc url
	public static final String URL = "";
	//add your jdbc username
	public static final String USERNAME = "";
	//add your jdbc password
	public static final String PASSWORD = "";
	//name of the created stored procedure in tier 3
	public static final String TIER_3_PROCEDURE_NAME="";
	//name of the created sequence in tier 3
	public static final String TIER_3_SEQUENCE_NAME="";

	//implement this method to connect to the db and return the connection object
	public static Connection connect() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

	//implement this method with a callable statement that calls the absolute value sql function
	public static long callAbsoluteValueFunction(long value) throws SQLException {
		String sql = "{ call " + "get_abs(?, ?) }";
		CallableStatement cs = connect().prepareCall(sql);
		cs.setLong(1, value);
		cs.registerOutParameter(2, Types.BIGINT);
		cs.execute();
		return (long) cs.getObject(2);
	}
	
	//private constructor so the class cannot be instantiated
	private ConnectionConfig(){
		super();
	}
}
