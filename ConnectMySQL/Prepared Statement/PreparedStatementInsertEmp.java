package com.deu.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInsertEmp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String un = "root";
		String pass = "root";
		
		int id;
		String name;
		int age;
		String email;
		long ph;
		float salary;
		
		Connection conn = null;
		ResultSet rs =null;
		
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, un, pass); 
		
		String sql = "insert into employee values (?,?,?,?,?,?)";
		
		System.out.println("Enter id, name, age, email, phone, salary:");
		id = sc.nextInt();
		//check if id already exists
		String checkId = "select * from employee where eid =?";
				
		PreparedStatement prep = conn.prepareStatement(checkId);
		prep.setInt(1, id);
		rs = prep.executeQuery();
		
		if (rs.next()) {
			System.out.println("ID already exists. Please enter a unique ID.");
			return;
		}
		
		name = sc.next();
		age = sc.nextInt();
		email = sc.next();
		ph = sc.nextLong();
		salary = sc.nextFloat();

		PreparedStatement prep1 = conn.prepareStatement(sql);
		prep1.setInt(1, id);
		prep1.setString(2, name);
		prep1.setInt(3, age);
		prep1.setString(4, email);
		prep1.setLong(5, ph);
		prep1.setFloat(6, salary);
		
		int i = prep1.executeUpdate();
		System.out.println(i+" records inserted"); 

	}

}
