package com.edu.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayNames1 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();

	    names.add("Alice");
	    names.add("Bob");
	    names.add("Carol");
	    names.add("Tom");
	    names.add("Jeon");
	    
	    System.out.println(names);
	    
		ArrayList<String> names1 = new ArrayList<>();
		
		names1.add("One");
	    names1.add("Two");
	    names1.add("Three");
	    
	    names.addAll(3, names1);
	    
	    System.out.println(names);
	}

}
