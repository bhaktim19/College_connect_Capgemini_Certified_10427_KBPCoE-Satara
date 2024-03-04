package com.edu.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayProduct {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDb";
		String un = "root";
		String pass = "root";
		
		Class.forName(driver);
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		conn = DriverManager.getConnection(url, un, pass);
		stmt = conn.createStatement();
		
		String sql = "select * from product";
		
		rs = stmt.executeQuery(sql);
		//pid | name      | price | quantity | category
		System.out.printf("%-5s | %-10s | %-10s | %-5s   | %-6s\n","pid", "name", "price", "quantity", "category");
		
		System.out.println("--------------------------------------------------------------");
		while (rs.next()) {
			System.out.printf("%-5d | %-10s | %-10.2f | %-10d | %-10s\n",rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4),rs.getString(5));
		}
		

	}

}
