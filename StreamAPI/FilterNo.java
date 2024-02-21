package com.edu.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNo {

	public static void main(String[] args) {
		
		List <Integer> lst = new ArrayList<Integer>();
		List <Integer> lst1 = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			lst.add(i);
		}
		//filter elements greater than 5
		System.out.println("Using traditional method:\nElements greater than 5:");
		for(int i:lst) {
			if(i>5)
				lst1.add(i);
		}
		System.out.println(lst1);
		
		//using stream api
		
		System.out.println("Using Stream API:\nElements greater than 5:");
		Stream<Integer> sobj = lst.stream();
		
		//apply lambda expression to do the same task
		
		List<Integer> lst2 =sobj.filter(n->n>5).collect(Collectors.toList());
		System.out.println(lst2);
		System.out.println("Elements less than 5");
		Stream<Integer> sobj1 = lst.stream();
		List<Integer> lst3 =sobj1.filter(n->n<5).collect(Collectors.toList());
		System.out.println(lst3);
		
		
	}

}
