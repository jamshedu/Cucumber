package com.hrms.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCDemo {
	
	String userName = "syntax_hrm";
	String password = "syntaxhrm123";
	//jbdc: driver type: hostname: port/db name 
    String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
    
   // @Test
    public void abc() throws SQLException {
    	Connection conn = DriverManager.getConnection(dbUrl, userName, password);
    	System.out.println("DB connection is successful");
    	Statement st = conn.createStatement();
    	ResultSet rs=st.executeQuery("select * from hs_hr_employees");
    	rs.next();
    	String firsName=rs.getString("emp_firstname");
    	System.out.println(firsName);
    	String lastName=rs.getString("emp_lastname");
    	System.out.println(lastName);
    	rs.next();
    	String firstName=rs.getString("emp_firstname");
    	System.out.println(firstName);
    	String allData;
    	while(rs.next()) {
    		allData = rs.getObject("emp_firstname").toString();
    		System.out.println(allData);
    		
    	}
    	rs.close();
    	st.close();
    	conn.close();
    	
    }
    @Test
    public void listTask() throws SQLException {
    	Connection conn = DriverManager.getConnection(dbUrl, userName, password);
    	System.out.println("DB connection is successful");
    	Statement st = conn.createStatement();
    	ResultSet rs=st.executeQuery("select * from ohrm_job_title");

    	List<String> jobTitle=new ArrayList<>();
    	while(rs.next()) {
    		jobTitle.add(rs.getObject("job_title").toString());
    		
    	}
    	for (String jt : jobTitle) {
    		System.out.println(jt);
			
		}
    	
    	
    	
    	
    	
    	
    	
    }
    
    
    
    
    
    
    
}
