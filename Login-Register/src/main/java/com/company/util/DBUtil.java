package com.company.util;

import java.sql.*;

public class DBUtil {
	

	 private static final String URL = "jdbc:mysql://localhost:3306/loginpage";
	 private static final String USERNAME = "root";
	 private static final String PASSWORD = "root";
   static {
       try {
           // Load the MySQL JDBC driver
           Class.forName("com.mysql.cj.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }

   public static Connection getConnection() throws SQLException {
      System.out.println("connection created");
	   return DriverManager.getConnection(URL, USERNAME, PASSWORD);
   }
}