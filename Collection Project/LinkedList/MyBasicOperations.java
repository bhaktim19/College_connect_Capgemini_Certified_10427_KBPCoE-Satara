package com.edu.linkedlist;

import java.util.LinkedList;

public class MyBasicOperations {

	public static void main(String[] args) {
		
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Orange");
		lst.add("Apple");
		lst.add("Banana");
		lst.add("Mango");
		
        System.out.println(lst);
        System.out.println("Size of the linked list: "+lst.size());
        System.out.println("Is LinkedList empty? "+lst.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'? "+lst.contains("Grape"));
	}

}
