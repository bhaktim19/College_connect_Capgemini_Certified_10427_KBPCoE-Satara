package com.edu.basicoperations;

public class StringMainApp {

	public static void main(String[] args) {
		
		String s1 ="Welcome";  
		String s2 ="Welcome";
		
		String s3 =new String("Welcome");
		String s4 =new String("Welcome");

		if(s1==s2)
			System.out.println("Addresses are same for s1 and s2");
		
		if(s3==s4)
			System.out.println("Addresses are same for s3 and s4");
		
		
	}

}
