package com.edu.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(1,"Amit");  
		  map.put(2,"Anurag");  
		  map.put(3,"Bhakti");
		  map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		  .forEach(System.out::println);

	}

}
