package com.edu.basicoperations;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next();
		String newstring="";
		char ch;
		
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			newstring = ch+newstring;
		}
		
		System.out.println("Reversed String : "+newstring);

	}

}
