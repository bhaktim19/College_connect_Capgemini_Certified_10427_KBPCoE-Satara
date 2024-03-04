package com.edu.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String un= "root";
		String pass = "root";
		
		Class.forName(driver);
		
		ResultSet rs= null;
		Connection conn = null;
		Statement stmt = null;
		
		int id;
		
		conn = DriverManager.getConnection(url, un, pass);
		
		stmt = conn.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to remove the product: ");
		id = sc.nextInt();
		//check if id already exists
		String checkId = "select * from product where pid ="+id;
		
		rs = stmt.executeQuery(checkId);
		
		if(rs.next()){
			String delsql = "delete from product where pid="+id;
			int i = stmt.executeUpdate(delsql);
			if(i>0) {
				System.out.println("Record is deleted");
			}
			else {
				System.out.println("Some error occurred");
			}
		}
		else {
			System.out.println("Product id not exists");
		}
		
	}

}
