package com.edu.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMainDemo {

	public static void main(String[] args) {
		
		// HashSet, TreeSet, LinkedHashSet
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(78);
		hs.add(56);
		hs.add(9);
		hs.add(45);
		hs.add(56);
		hs.add(45);
		hs.add(null);
		System.out.println("HashSet: "+hs);

		Set<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(78);
		lhs.add(56);
		lhs.add(9);
		lhs.add(45);
		lhs.add(56);
		lhs.add(45);
		lhs.add(null);
		System.out.println("LinkedHashSet: "+lhs);
		
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(78);
		ts.add(56);
		ts.add(9);
		ts.add(45);
		ts.add(56);
		ts.add(45);
		System.out.println("TreeSet: "+ts);
		
		//Use Iterator
		System.out.println("TreeSet using Iterator:");
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
