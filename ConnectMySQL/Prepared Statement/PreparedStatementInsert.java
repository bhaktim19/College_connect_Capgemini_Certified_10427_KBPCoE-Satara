package com.deu.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String un = "root";
		String pass = "root";
		
		int id;
		String name;
		float price;
		int quantity;
		String category;
		
		Connection conn = null;
		ResultSet rs =null;
		
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, un, pass); 
		
		String sql = "insert into product values (?,?,?,?,?)";
		
		System.out.println("Enter id, name, price, quantity and category: ");
		id = sc.nextInt();
		//check if id already exists
		String checkId = "select * from product where pid =?";
				
		PreparedStatement prep = conn.prepareStatement(checkId);
		prep.setInt(1, id);
		rs = prep.executeQuery();
		
		if (rs.next()) {
			System.out.println("ID already exists. Please enter a unique ID.");
			return;
		}
		
		name = sc.next();
		price = sc.nextFloat();
		quantity = sc.nextInt();
		category = sc.next();

		PreparedStatement prep1 = conn.prepareStatement(sql);
		prep1.setInt(1, id);
		prep1.setString(2, name);
		prep1.setFloat(3, price);
		prep1.setInt(4, quantity);
		prep1.setString(5, category);
		
		int i = prep1.executeUpdate();
		System.out.println(i+" records inserted"); 
		
	}

}
