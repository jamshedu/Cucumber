package com.hrms.sql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
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

public class StoringData {
	
	String userName = "syntax_hrm";
	String password = "syntaxhrm123";
	//jbdc: driver type: hostname: port/db name 
    String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
    
   // @Test
	public void getAndStoreData() throws SQLException  {
    	Connection conn = DriverManager.getConnection(dbUrl, userName, password);
    	Statement st = conn.createStatement();
    	ResultSet rs = st.executeQuery("select id, name, country_code from ohrm_location;");
    	//System.out.println(rs);
    	List<Map<String, String>>listOfData= new ArrayList<>();
    	Map<String,String >mapData;
    	while(rs.next()) {
    		mapData=new LinkedHashMap<>();
    		mapData.put("Location id", rs.getObject("id").toString());
    		//System.out.println(mapData);
    		mapData.put("Office name", rs.getObject("name").toString());
    		//System.out.println(mapData);
    		mapData.put("Country code", rs.getObject("country_code").toString());
    		//System.out.println(mapData);
    		listOfData.add(mapData);
    	}
    	System.out.print(listOfData);
    	System.out.println();
    		rs.close();
    		st.close();
    		conn.close();
    		}
    @Test
	public void getAndStoreDataEnhanceed() throws SQLException  {
    	Connection conn = DriverManager.getConnection(dbUrl, userName, password);
    	Statement st = conn.createStatement();
    	ResultSet rs = st.executeQuery("select * from ohrm_job_title");
    	ResultSetMetaData rsMetaDat = rs.getMetaData();
    	List<Map<String, String >> listData= new ArrayList<>();
    	Map<String, String>mapData ;
    	while (rs.next()) {
    		mapData = new LinkedHashMap<>();
    		for(int i = 1; i<=rsMetaDat.getColumnCount();i++) {
    			mapData.put(rsMetaDat.getColumnName(i), rs.getObject(i).toString());
    			
    		}
    		listData.add(mapData);
    	}
    	System.out.println(listData);
    	
     }
}
	

