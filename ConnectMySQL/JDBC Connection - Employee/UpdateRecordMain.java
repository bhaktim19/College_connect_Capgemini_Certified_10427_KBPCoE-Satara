package com.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecordMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String un = "root";
		String pass = "root";
				
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Class.forName(driver);
		
		conn = DriverManager.getConnection(url, un, pass);
		
		stmt = conn.createStatement();
		
		
		int eid,choice,i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to update the Employee: ");
		eid = sc.nextInt();
		
		//check if id already exists
		String checkId = "select * from employee where eid ="+eid;
				
		rs = stmt.executeQuery(checkId);
		
		if(!rs.next()) {
			System.out.println("Employee Id does not exists. Please enter valid employee Id....");
			return;
		}else {
			while(true) {
				System.out.println("Choose the parameter you want to update:");
				System.out.println("1.Age\n2.Email\n3.Phone\n4.Salary\n5.Exit");
				choice = sc.nextInt();
				
				switch(choice) {
				
				case 1: //update age 
					System.out.println("Enter updated employee age: ");
					int up_age = sc.nextInt();
					String updtAgeSql = "update employee set eage="+up_age+ " where eid="+eid;
					i = stmt.executeUpdate(updtAgeSql);
					if (i>0) {
						System.out.println("Age updated...");
					}else {
						System.out.println("Some error occured... ");
					}
					break;
					
				case 2: //update email
					System.out.println("Enter updated employee Email Id: ");
					String up_mail = sc.next();
					String updtEmailSql = "update employee set eemail='"+up_mail+ "' where eid="+eid;
					i = stmt.executeUpdate(updtEmailSql);
					if (i>0) {
						System.out.println("Email updated...");
					}else {
						System.out.println("Some error occured... ");
					}
					break;
					
				case 3: //update phone
					System.out.println("Enter updated employee phone number: ");
					long up_phone = sc.nextLong();
					String updtphoneSql = "update employee set ephone="+up_phone+ " where eid="+eid;
					i = stmt.executeUpdate(updtphoneSql);
					if (i>0) {
						System.out.println("Phone updated...");
					}else {
						System.out.println("Some error occured... ");
					}
					break;
					
				case 4://update salary
					System.out.println("Enter updated employee salary: ");
					float up_salary = sc.nextFloat();
					if(up_salary < 50000) {
						System.out.println("Salary should be greater than 50,000...");
						return;
					}
					String updtSalarySql = "update employee set esalary="+up_salary+ " where eid="+eid;
					i = stmt.executeUpdate(updtSalarySql);
					if (i>0) {
						System.out.println("Salary updated...");
					}else {
						System.out.println("Some error occured... ");
					}
					break;
				
				case 5:
					System.out.println("Updates completed.....\nExiting the system....");
					System.exit(0);
				
				default:
					System.out.println("Invalid choice....");
				}
			}
		}
		
	
		
	}

}
