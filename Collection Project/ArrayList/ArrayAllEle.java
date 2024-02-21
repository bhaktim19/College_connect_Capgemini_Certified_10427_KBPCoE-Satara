package com.edu.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayAllEle {

	public static void main(String[] args) {
		
		ArrayList<String> arli = new ArrayList<String>();
        
		arli.add("First");
        arli.add("Second");
        arli.add("Third");
        arli.add("Random");
        
        System.out.println(arli);
        
        List<String> list = new ArrayList<String>();
       
        list.add("Second");
        list.add("Random");
        
        System.out.println(list);

        System.out.println("Does ArrayList contains all list elements?: "
                    +arli.containsAll(list));
        list.add("one");
        
        System.out.println(list);
        
        System.out.println("Does ArrayList contains all list elements?: "
                    +arli.containsAll(list));
	        
	}

}
