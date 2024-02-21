package com.edu.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
        List<String> list=new ArrayList<String>();  
        list.add("Aniket");  
        list.add("Maya");  
        list.add("Manu");  
        list.add("Arun"); 
        list.add("Sagar");
        System.out.println("Names in the List:");
        list.forEach(  
                (n)->System.out.println(n)  
        );

	}

}
