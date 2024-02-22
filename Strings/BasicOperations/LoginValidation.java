package com.edu.basicoperations;

import java.util.Scanner;

public class LoginValidation {
	
private static String uname,upass;
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		uname = sc.next();
		
		System.out.println("Enter password : ");
		upass = sc.next();
	}
	//equalsIgnoreCase->not case sensitive
	//equals ->case sensitive
	
	public static void checkUser() {
		if(uname.equalsIgnoreCase("admin") && upass.equals("admin123")) {
			System.out.println("Valid user");
		}
		else {
			System.out.println("Invalid user");
		}
	}


	public static void main(String[] args) {
		LoginValidation.input();
		LoginValidation.checkUser();

	}

}
