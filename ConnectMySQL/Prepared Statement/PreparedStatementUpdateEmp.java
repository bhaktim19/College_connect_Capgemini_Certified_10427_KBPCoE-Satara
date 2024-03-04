package com.deu.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementUpdateEmp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String un = "root";
		String pass = "root";
		
		Class.forName(driver);
		
		ResultSet rs= null;
		Connection conn = null;
				
		int id,i;
		int choice;
		
		conn = DriverManager.getConnection(url, un, pass);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to update the employee: ");
		id = sc.nextInt();
		
		//check if id already exists
		String checkId = "select * from employee where eid = ?";
		PreparedStatement prep = conn.prepareStatement(checkId);
		prep.setInt(1, id);
		rs = prep.executeQuery();
		
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
					String updtAgeSql = "update employee set eage= ? where eid= ?";
					PreparedStatement prep1 = conn.prepareStatement(updtAgeSql);
					prep1.setInt(1, up_age);
					prep1.setInt(2, id);
					i = prep1.executeUpdate();
					if (i>0) {
						System.out.println("Age updated...");
					}else {
						System.out.println("Some error occured... ");
					}
					break;
					
				case 2: //update email
					System.out.println("Enter updated employee Email Id: ");
					String up_mail = sc.next();
					String updtEmailSql = "update employee set eemail= ? where eid= ?";
					PreparedStatement prep2 = conn.prepareStatement(updtEmailSql);
					prep2.setString(1, up_mail);
					prep2.setInt(2, id);
					i = prep2.executeUpdate();
					if (i>0) {
						System.out.println("Email updated...");
					}else {
						System.out.println("Some error occured... ");
					}
					break;
					
				case 3: //update phone
					System.out.println("Enter updated employee phone number: ");
					long up_phone = sc.nextLong();
					String updtphoneSql = "update employee set ephone= ? where eid= ?";
					PreparedStatement prep3 = conn.prepareStatement(updtphoneSql);
					prep3.setLong(1, up_phone);
					prep3.setInt(2, id);
					i = prep3.executeUpdate();
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
					String updtSalarySql = "update employee set esalary= ? where eid= ?";
					PreparedStatement prep4 = conn.prepareStatement(updtSalarySql);
					prep4.setFloat(1, up_salary);
					prep4.setInt(2, id);
					i = prep4.executeUpdate();
					if (i>0) {
						System.out.println("Salary updated...");
					}else {
						System.out.println("Some error occured... ");
					}
					break;
				
				case 5:
					System.out.println("Updates completed.....\nExiting the updates....");
					return;
				
				default:
					System.out.println("Invalid choice....");
				}// switch close
			}//while close
		}//if close

	}

}
