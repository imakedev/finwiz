package com.gl.finwiz.service;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Test {
	   static final String DB_URL = "jdbc:sqlserver://localhost:1433;";
	   static final String USER = "sa";
	   static final String PASS = "p@ssw0rd";
	   public void test2() {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
		   
		   
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      stmt = conn.createStatement();
	      String sql;
	      String sql2;
	      sql = "select * from SYSTEM_CACHE";
	      ResultSet rs = stmt.executeQuery(sql);

	      while(rs.next()){
	    	 String cacheId  = rs.getString("CACHE_ID");
	         int cacheStatus = rs.getInt("CACHE_STATUS");
	         String cacheJava = rs.getString("CACHE_JAVA");
	         String tableName = rs.getString("TABLE_NAME");
	         String columnKey = rs.getString("COLUMN_KEY");
	         String columnDesc = rs.getString("COLUMN_DESC");
	         
	         sql2 = "select * from "+tableName;
		     ResultSet rs2 = stmt.executeQuery(sql2);

		     Map<String, Object> parameters = new HashMap<String, Object>();
		     while(rs2.next()){
		 		 parameters.put("id", rs2.getLong("ID"));
		 		 parameters.put("name", rs2.getString("NAME"));
				}
	      }
	    
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	    
	      se.printStackTrace();
	   }catch(Exception e){
	      
	      e.printStackTrace();
	   }finally{
	     
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }
	   }
	}
}
