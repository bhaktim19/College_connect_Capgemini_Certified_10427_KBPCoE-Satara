package com.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecordMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String un = "root";
		String pass = "root";
		
		int eid;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Class.forName(driver);
		
		conn = DriverManager.getConnection(url, un, pass);
		
		stmt = conn.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id to remove: ");
		eid = sc.nextInt();
		
		String sql = "select * from employee where eid ="+eid;
		rs = stmt.executeQuery(sql);

		if(rs.next()){
			String delsql = "delete from employee where eid="+eid;
			int i = stmt.executeUpdate(delsql);
			if(i>0) {
				System.out.println("Record is deleted");
			}
			else {
				System.out.println("Some error occurred");
			}
		}
		else {
			System.out.println("Employee id not exists");
		}	
	}

}
