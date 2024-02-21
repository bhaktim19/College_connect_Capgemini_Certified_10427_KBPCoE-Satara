package com.edu.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortDataMain {

	public static void main(String[] args) {

		List<Integer> lob = new LinkedList<Integer>();
		
		
		lob.add(9);
		lob.add(56);
		lob.add(5);
		lob.add(2);
		lob.add(51);
		
		//sort, shuffle, swap
		Collections.sort(lob);
		
		System.out.println("after sort "+lob);
		
		Collections.shuffle(lob);
		System.out.println("first shuffle  "+lob);
		Collections.shuffle(lob);
		System.out.println("Second shuffle  "+lob);
		
		System.out.println("Swap method");
		
		Collections.swap(lob, 3, 2);
		System.out.println("After swap "+lob);
		
	}

}
