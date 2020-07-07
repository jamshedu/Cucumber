package com.hrms.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class HomeWorkSQL {
	
	
	String userName = "syntax_hrm";
	String password = "syntaxhrm123";
	//jbdc: driver type: hostname: port/db name 
    String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
    
    
   @Test 
   public void sqlHM() throws SQLException {
	   
	   Connection conn = DriverManager.getConnection(dbUrl, userName, password);
	   Statement st = conn.createStatement();
	   st.executeQuery("");
	   
   }
	
	

}
