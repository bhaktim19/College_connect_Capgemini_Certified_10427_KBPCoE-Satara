package com.edu.arraylist;

import java.util.ArrayList;

public class ListClear {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

	    names.add("Alice");
	    names.add("Bob");
	    names.add("Carol");
	    names.add("Tom");
	    names.add("Jeon");
	    
	    System.out.println("Actual ArrayList:"+names);
        names.clear();
        System.out.println("After clear ArrayList:"+names);

	}

}
