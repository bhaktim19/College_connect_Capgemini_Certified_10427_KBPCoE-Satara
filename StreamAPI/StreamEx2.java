package com.edu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		List<String>lst =Arrays.asList("USA","Japan","India","China", "","Russia","uk");
		Stream <String> sobj = lst.stream();
		
		//count no. of strings with starts with "u"
		long n=sobj.filter(x->x.startsWith("u")).count();

		System.out.println("No.of strings starting with u:\n" +n);
		
		//remove all empty empty strings from the list 
		//and collect them into a another list

		List<String> lst1=lst.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		System.out.println("The list after removing the empty string :\n"+lst1);
		
		List<String> lst2=lst1.stream().sorted().map(x ->x.toUpperCase()).collect(Collectors.toList());
		System.out.println("The list after sorting in uppercase :\n"+ lst2);
		
		//convert all strings to  capital letters and collect them into an array 

		String []arr=lst1.stream().map(x->x.toUpperCase()).toArray(String[]::new);

		System.out.println("Array of sorted strings in uppercase :");

		for(String i: arr){
		   System.out.print(i+" ,");
		}
	}

}
