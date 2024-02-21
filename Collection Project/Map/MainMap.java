package com.edu.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(11, "Bhakti");
		hmap.put(12,"Anurag");
		hmap.put(13, "Sam");
		
		System.out.println("HashMap");
		System.out.println(hmap);
		
		Map<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
		//Maintains the insertion order
		lhmap.put(11, "Bhakti");
		lhmap.put(13, "Sam");
		lhmap.put(12,"Anurag");
		
		System.out.println("LinkedHashMap");
		System.out.println(lhmap);
		
		Map<Integer, String> tmap = new TreeMap<Integer, String>();
		//Maintains the insertion order
		tmap.put(11, "Bhakti");
		tmap.put(13, "Sam");
		tmap.put(12,"Anurag");
		
		System.out.println("TreeMap");
		System.out.println(tmap);
	}

}
