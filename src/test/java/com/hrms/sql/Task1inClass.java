package com.hrms.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Task1inClass {
	
	
	
	
	String userName = "syntax_hrm";
	String password = "syntaxhrm123";
	//jbdc: driver type: hostname: port/db name 
    String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
    
    
    @Test
   	public void getNationality() throws SQLException  {
       	Connection conn = DriverManager.getConnection(dbUrl, userName, password);
       	Statement st = conn.createStatement();
       	ResultSet rs = st.executeQuery("select id as nationality_id, name as nationality from ohrm_nationality");
       	ResultSetMetaData rsMetaDat = rs.getMetaData();

       	List<Map<String, String>> listOfData= new ArrayList<>();
       	Map<String, String> mapData;
       	while(rs.next()) {
       		mapData=new LinkedHashMap<>();
       		for(int i = 1; i<=rsMetaDat.getColumnCount(); i++) {
       			mapData.put(rsMetaDat.getColumnName(i),rs.getObject(i).toString());
       		}
       		System.out.print(listOfData);
       		listOfData.add(mapData);
       		
       		}
       	
       	
    }
}
