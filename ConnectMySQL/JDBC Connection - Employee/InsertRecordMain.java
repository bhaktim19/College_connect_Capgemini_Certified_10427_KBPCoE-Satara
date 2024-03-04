package com.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
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
		
		ResultSet rs = null;
		
		Connection conn = null;
		
		Statement stmt = null;
		
		Class.forName(driver);
		
		conn = DriverManager.getConnection(url, un, pass);
		
		stmt = conn.createStatement();
		
		//Execute query
		
		// take data from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name, age, email, ph, salary:");
		
		id = sc.nextInt();
		
		// check if id already exists
		String checkId = "select * from employee where eid ="+id;
		
		rs = stmt.executeQuery(checkId);
		
		if (rs.next()) {
			System.out.println("ID already exists. Please enter a unique ID.");
			return;
		}		
		
		name = sc.next();
		age = sc.nextInt();
		email = sc.next();
		
		//check if email already exists
		String checkMail = "select * from employee where eemail = '"+email+"'";
		
		rs= stmt.executeQuery(checkMail);
		
		if(rs.next()) {
			System.out.println("Email already exists. Please enter a different email.");
            return;
		}
		
		ph=sc.nextLong();
		
		// check if phone already exists
		String checkPh = "select * from employee where ephone="+ph;
		rs = stmt.executeQuery(checkPh);
		
		if(rs.next()) {
			System.out.println("Phone number already exists. Please enter a different phone number.");
            return;
		}
		
		
		salary = sc.nextFloat();
		
		if(salary<50000) {
			System.out.println("Salary should be greater than 50,000...");
			return;
		}
		
		String s = "insert into employee values("+id+",'"+name+"',"+age+",'"+email+"',"+ph+","+salary+")"; 
		
		int i = stmt.executeUpdate(s);// i>0 record inserted successfully
		
		if (i>0) {
			System.out.println("Registration done successfully...");
		}
		else {
			System.out.println("Some error occured");
		}
	}

}
