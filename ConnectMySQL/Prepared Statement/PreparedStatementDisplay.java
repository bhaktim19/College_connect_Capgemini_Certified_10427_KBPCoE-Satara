package com.deu.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDisplay {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String pass = "root";
		String un = "root";
		Connection conn = null;
		ResultSet rs= null;
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, un, pass);
		
		String sql = "select * from employee";
		
		PreparedStatement prep = conn.prepareStatement(sql);
		
		rs = prep.executeQuery();
		
		System.out.printf("%-5s | %-10s | %-5s | %-20s | %-15s | %-12s %n","Id","Ename","Age","Email","Phone","Salary");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		while(rs.next()) {
			
			System.out.printf("%-5d | %-10s | %-5d | %-20s | %-15d | %-10.2f %n",rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getLong(5),rs.getFloat(6));

		}
		
	}

}
