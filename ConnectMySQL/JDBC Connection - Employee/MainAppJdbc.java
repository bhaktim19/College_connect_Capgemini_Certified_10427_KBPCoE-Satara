package com.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainAppJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Steps to connect with MySQL database
		//1. Load the driver
		//2. Make the connection
		//3. create a statement
		//4. execute SQL commands
		
		//1. Load the driver
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String un = "root";
		String pass= "root";
		
		Class.forName(driver);
		
		//2. Make the connection
		
		Connection conn=null;
		conn = DriverManager.getConnection(url, un, pass);
		System.out.println(conn);
		
		//3. create a statement
		
		Statement stmt=null;
		stmt = conn.createStatement();
		
		//4. execute SQL commands
		
		ResultSet rs = null;
		
		String sql = "select * from employee";
		rs = stmt.executeQuery(sql);
		System.out.printf("%-5s | %-10s | %-5s | %-20s | %-15s | %-12s %n","Id","Ename","Age","Email","Phone","Salary");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		while(rs.next()) {
			
			System.out.printf("%-5d | %-10s | %-5d | %-20s | %-15d | %-10.2f %n",rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getLong(5),rs.getFloat(6));

		}
		
		// varchar -> getString
		// int -> getInt
		// float -> getFloat
		// date -> getDate
		

	}

}
