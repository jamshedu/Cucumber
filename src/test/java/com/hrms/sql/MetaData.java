package com.hrms.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;



public class MetaData {
	
	
	
	String userName = "syntax_hrm";
	String password = "syntaxhrm123";
	//jbdc: driver type: hostname: port/db name 
    String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
    
    
    //@Test
    public void dbMetadata() throws SQLException {
    	Connection conn = DriverManager.getConnection(dbUrl, userName, password);
    	DatabaseMetaData dbMetaData = conn.getMetaData();
    	String driverName=dbMetaData.getDriverName();
    String dbVersian = dbMetaData.getDatabaseProductVersion();
    System.out.println(driverName);
    System.out.println(dbVersian);
		
   }
    
    @Test
    public void rsMetadata() throws SQLException {
    	
    	Connection conn = DriverManager.getConnection(dbUrl, userName, password);
    	Statement st = conn.createStatement();
    	ResultSet rs=st.executeQuery("select * from hs_hr_employees where emp_number = 4688");
    	ResultSetMetaData rsMetadata = rs.getMetaData();
    	int colNumber = rsMetadata.getColumnCount();
    	System.out.println(colNumber);
    	
    	for(int i = 1; i<colNumber; i++) {
    		String colName= rsMetadata.getColumnName(i);
    		System.out.println(colName);

    	}
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
