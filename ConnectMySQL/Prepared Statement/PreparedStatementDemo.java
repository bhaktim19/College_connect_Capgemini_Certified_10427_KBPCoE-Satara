package com.deu.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String pass = "root";
		String un = "root";
		Connection conn = null;
		ResultSet rs= null;
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, un, pass);
		
		String sql = "select * from product";
		
		PreparedStatement prep = conn.prepareStatement(sql);
		
		rs = prep.executeQuery();
		
		System.out.printf("%-5s | %-10s | %-10s | %-5s   | %-6s\n","pid", "name", "price", "quantity", "category");
		
		System.out.println("--------------------------------------------------------------");
		while (rs.next()) {
			System.out.printf("%-5d | %-10s | %-10.2f | %-10d | %-10s\n",rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4),rs.getString(5));
		}
		

	}

}
