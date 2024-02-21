package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Array {

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			lst.add(i);
		}
		
		Stream<Integer> sobj = lst.stream();
		
		Integer[] arr=sobj.toArray(Integer[]::new);
		System.out.println("Elements of array:");
		for(Integer i:arr)
	          System.out.println(i);
	}

}
