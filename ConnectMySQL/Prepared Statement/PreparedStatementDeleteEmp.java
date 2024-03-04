package com.deu.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDeleteEmp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String un = "root";
		String pass = "root";
		
		int id;
		
		Class.forName(driver);
		
		Connection conn = null;
		ResultSet rs = null;
		conn = DriverManager.getConnection(url, un, pass);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to remove the employee: ");
		id = sc.nextInt();
		
		//check if id already exists
		String checkId = "select * from employee where eid = ?";
		
		PreparedStatement prep = conn.prepareStatement(checkId);
		prep.setInt(1, id);
		rs = prep.executeQuery();
		
		if(rs.next()){
			String delsql = "delete from employee where eid= ?";
			PreparedStatement prep1 = conn.prepareStatement(delsql);
			prep1.setInt(1, id);
			
			int i = prep1.executeUpdate();
			if(i>0) {
				System.out.println(i+" Record is deleted");
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
