package com.edu.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(1,"Amit");  
		  map.put(2,"Anurag");  
		  map.put(3,"Bhakti");  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		  }

	}

}
