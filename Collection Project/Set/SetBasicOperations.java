package com.edu.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetBasicOperations {

	public static void main(String[] args) {
		
        Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   
        data.add(21);   
        data.add(41);  
        data.add(91);   
        data.add(71);   
        data.add(81);         
        System.out.println("data: " + data);  
        
        System.out.println("size of the data is : " + data.size());   
        
        System.out.println("Set: " + data);  
        System.out.println("Does the Set contains '91'?" + data.contains(91));   
        System.out.println("Does the Set contains '51'? " + data.contains(51)); 
        
        System.out.println("\nThe hash code value of set is:"+ data.hashCode());
        
        data.clear();   
        System.out.println("The final set: " + data);  
        
        

	}

}
