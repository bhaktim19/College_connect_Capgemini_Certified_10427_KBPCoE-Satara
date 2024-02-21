package com.edu.stream;
import java.util.stream.Stream;

public class DisplayStram {

	public static void main(String[] args) {
		String arr[]= {"Bhakti","Krushna","Ganesh","Sam","Vedanti"};
		
		Stream <String> sobj1 = Stream.of(arr);
		
		System.out.println("Elements from array having length greater than 4, in upper case and sorted in ascending order:");
		sobj1.filter(n->n.length()>4)
		.map(name->name.toUpperCase()).sorted()
		.forEach(System.out::println);

		
	}

}
