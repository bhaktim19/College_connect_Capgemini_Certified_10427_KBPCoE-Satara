package com.edu.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MyDB";
		String un= "root";
		String pass = "root";
		
		Class.forName(driver);
		
		ResultSet rs= null;
		Connection conn = null;
		Statement stmt = null;
		
		int id,i;
		int choice;
		
		
		conn = DriverManager.getConnection(url, un, pass);
		
		stmt = conn.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to update the product: ");
		id = sc.nextInt();
		
		//check if id already exists
		String checkId = "select * from product where pid ="+id;
				
		rs = stmt.executeQuery(checkId);
		
		if(!rs.next()) {
			System.out.println("Product Id does not exists. Please enter valid product Id....");
			return;
		}else {
		 while(true) {
			System.out.println("Choose the parameter you want to update:");
			System.out.println("1.Name\n2.Price\n3.Quantity\n4.Category\n5.Exit");
			choice = sc.nextInt();
		
			switch(choice) {
			case 1: // update name
				System.out.println("Enter updated product name: ");
				String up_name = sc.next();
				String updtNmaeSql = "update product set name='"+up_name+"' where pid="+id;
				i = stmt.executeUpdate(updtNmaeSql);
				if(i>0) {
					System.out.println("Name is updated...");
				}else {
					System.out.println("Some error occured...");
				}
				break;
				
			case 2: //update price
				System.out.println("Enter updated product price: ");
				float up_price = sc.nextFloat();
				String updtPriceSql = "update product set price="+up_price+"where pid="+id;
				i = stmt.executeUpdate(updtPriceSql);
				if (i>0) {
					System.out.println("Price is updated...");
				}else {
					System.out.println("Some error occured... ");
				}
				break;
				
			case 3: //update Quantity
				System.out.println("Enter updated product quantity: ");
				int up_quantity = sc.nextInt();
				String updtQuantitySql = "update product set quantity="+up_quantity+" where pid="+id;
				//System.out.println(updtQuantitySql);
				i = stmt.executeUpdate(updtQuantitySql);
				if (i>0) {
					System.out.println("Quantity is updated...");
				}else {
					System.out.println("Some error occured... ");
				}
				break;
				
			case 4: //update category
				System.out.println("Enter updated product category: ");
				String up_category = sc.next();
				String updtCategorySql = "update product set category='"+up_category+"' where pid="+id;
				i = stmt.executeUpdate(updtCategorySql);
				if (i>0) {
					System.out.println("Category is updated...");
				}else {
					System.out.println("Some error occured... ");
				}
				break;
				
			case 5:
				System.out.println("Thanks for using the application... Exiting....");
				System.exit(0);	
				
			}
		}
	}
		

		
		/*
		if(rs.next()){
			System.out.println("Enter updated product price: ");
			float price = sc.nextFloat();
			String updtsql = "update product set price="+price+ " where pid="+id;; 
			int i = stmt.executeUpdate(updtsql);
			if(i>0) {
				System.out.println("Price is updated");
			}
			else {
				System.out.println("Some error occurred");
			}
		}
		else {
			System.out.println("Product id not exists");
		}
	*/
	}

}
