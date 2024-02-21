package com.edu.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOddNo {

	public static void main(String[] args) {
		List <Integer> lst = new ArrayList<Integer>();

		for(int i=1; i<=10; i++) {
			lst.add(i);
		}
		
		Stream<Integer> sobj = lst.stream();
		
		System.out.println("Even numbers:");
		List<Integer> lst1 =sobj.filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(lst1);
		
		Stream<Integer> sobj1 = lst.stream();
		
		System.out.println("Odd numbers:");
		List<Integer> lst2 =sobj1.filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(lst2);

	}

}
