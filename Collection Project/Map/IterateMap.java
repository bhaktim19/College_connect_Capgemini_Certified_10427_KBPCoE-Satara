package com.edu.map;

import java.util.Map;
import java.util.TreeMap;

public class IterateMap {

	public static void main(String[] args) {
		Map<Long, String> tmap = new TreeMap<Long, String>();
		//Maintains the insertion order
		tmap.put(1122334455l, "Bhakti");
		tmap.put(1234567890l, "Sam");
		tmap.put(4567411829l,"Anurag");
		
		System.out.println(tmap);
		
		for(Map.Entry<Long, String> map : tmap.entrySet()) {
			System.out.println(map.getKey()+"\t"+map.getValue());
		}
		
		long l=1122334455l;
		
		for(Map.Entry<Long, String> map : tmap.entrySet()) {
			if(map.getKey()==l) {
				System.out.println("This phone number belongs to: "+map.getValue());
			}
		}

	}

}
