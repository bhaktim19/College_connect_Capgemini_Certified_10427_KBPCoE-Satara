package com.edu.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayNames {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

	    names.add("Alice");
	    names.add("Bob");
	    names.add("Carol");
	    names.add("Tom");
	    names.add("Jeon");
	    
	    System.out.println(names);
	    
	    //get elements by index
        System.out.println("Element at index 1: "+names.get(1));
	    
        System.out.println("Does list contains Tom? "+names.contains("Tom"));
        
      //add elements at a specific index
        names.add(2,"Jin");
	    System.out.println("Using Iterator Interface :");
		Iterator<String> itobj = names.iterator();
		while(itobj.hasNext()) {
			System.out.println(itobj.next());
		}
		
		System.out.println(names);
        System.out.println("Is arraylist empty? "+names.isEmpty());
        System.out.println("Index of Tom is "+names.indexOf("Tom"));
        System.out.println("Size of the arraylist is: "+names.size());
	}

}
