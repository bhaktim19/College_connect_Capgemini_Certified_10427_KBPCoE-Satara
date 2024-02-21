package com.edu.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayPhone {

	public static void main(String[] args) {
		
		ArrayList <String> PhoneNumbers = new ArrayList<String>();
		
		PhoneNumbers.add("9022283658");
		PhoneNumbers.add("9011183658");
		PhoneNumbers.add("9022242480");
		PhoneNumbers.add("9011142480");
		PhoneNumbers.add("9881685838");
		
		System.out.println(PhoneNumbers);
		
		System.out.println("Using Iterator interface");
		Iterator<String> itobj  = PhoneNumbers.iterator();
		while(itobj.hasNext()) {
			System.out.println(itobj.next());
		}
		
	}

}
