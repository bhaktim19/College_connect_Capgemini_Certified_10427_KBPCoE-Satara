package com.edu.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {

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
		String name;
		float price;
		int quantity;
		String category;
		
		conn = DriverManager.getConnection(url, un, pass);
		
		stmt = conn.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name, price, quantity and category: ");
		id = sc.nextInt();
		//check if id already exists
		String checkId = "select * from product where pid ="+id;
		
		rs = stmt.executeQuery(checkId);
		
		if (rs.next()) {
			System.out.println("ID already exists. Please enter a unique ID.");
			return;
		}
		name = sc.next();
		price = sc.nextFloat();
		quantity = sc.nextInt();
		category = sc.next();
		
		String sql = "insert into product values("+id+",'"+name+"',"+price+","+quantity+",'"+category+"')";
		
		int i = stmt.executeUpdate(sql);
		
		if(i>0) {
			System.out.println("Record inserted successfully...");
		}else {
			System.out.println("Some error occurred....");
		}
		

	}

}
