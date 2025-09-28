package com.tap.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connector_factory 
{
	static Connection con=null;
	static String url="jdbc:mysql://localhost:3306/food_app";
	static String name="root";
	static String pwd="root";
	
	
   static public Connection requestConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,name,pwd);
	
		return con;
		
	}
	
	

}
