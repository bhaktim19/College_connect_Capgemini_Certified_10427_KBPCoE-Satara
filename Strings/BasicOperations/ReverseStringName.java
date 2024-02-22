package com.edu.basicoperations;

import java.util.Scanner;

public class ReverseStringName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next();
		String org = name; 
		String revstr="";
		char ch;
		
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			revstr = ch+revstr;
		}
		
		System.out.println("Reversed String using loop : "+revstr);
		
		String name2=org;
		StringBuffer bf = new StringBuffer(name2);
		String revstr1=bf.reverse().toString();
		System.out.println("Reversed String using reverse function : "+revstr1);
		

	}

}
