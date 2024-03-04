package com.deu.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementUpdate {

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
		System.out.println("Enter id to update the product: ");
		id = sc.nextInt();
		
		//check if id already exists
		String checkId = "select * from product where pid = ?";
		PreparedStatement prep = conn.prepareStatement(checkId);
		prep.setInt(1, id);
		rs = prep.executeQuery();
		
		if(!rs.next()) {
			System.out.println("Product Id does not exists. Please enter valid product Id....");
			return;
		}else {
		 while(true) {
			System.out.println("Choose the parameter you want to update:");
			System.out.println("1. Name\n2. Price\n3. Quantity\n4. Exit");
			choice = sc.nextInt();
		
			switch(choice) {
			case 1: // update name
				System.out.println("Enter updated product name: ");
				String up_name = sc.next();
				String updtNmaeSql = "update product set name= ? where pid= ?";
				PreparedStatement prep1 = conn.prepareStatement(updtNmaeSql);
				prep.setString(1, up_name);
				prep.setInt(2, id);
				i = prep.executeUpdate();
				if(i>0) {
					System.out.println("Name is updated...");
				}else {
					System.out.println("Some error occured...");
				}
				break;
				
			case 2: //update price
				System.out.println("Enter updated product price: ");
				float up_price = sc.nextFloat();
				String updtPriceSql = "update product set price= ? where pid = ?";
				PreparedStatement prep2 = conn.prepareStatement(updtPriceSql);
				prep2.setFloat(1, up_price);
				prep2.setInt(2, id);
				i = prep2.executeUpdate();
				if (i>0) {
					System.out.println("Price is updated...");
				}else {
					System.out.println("Some error occured... ");
				}
				break;
				
			case 3: //update Quantity
				System.out.println("Enter updated product quantity: ");
				int up_quantity = sc.nextInt();
				String updtQuantitySql = "update product set quantity= ? where pid= ?";
				PreparedStatement prep3 = conn.prepareStatement(updtQuantitySql);
				prep3.setInt(1, up_quantity);
				prep3.setInt(2, id);
				i = prep3.executeUpdate();
				if (i>0) {
					System.out.println("Quantity is updated...");
				}else {
					System.out.println("Some error occured... ");
				}
				break;
				
			case 4:
				System.out.println("Thanks for using the application... Exiting....");
				System.exit(0);	
				
			default:
				System.out.println("Invalid choice...");
			}//switch close
		}//while close
	}//if close

	}

}
