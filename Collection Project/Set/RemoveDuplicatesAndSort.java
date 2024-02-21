package com.edu.set;

import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDuplicatesAndSort {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>();
        lst.add(98);
        lst.add(78);
        lst.add(78);
        lst.add(99);
        lst.add(45);
        lst.add(34);
        
        TreeSet<Integer> uniqueSortedData = new TreeSet<>(lst);
        
        ArrayList<Integer> resultList = new ArrayList<>(uniqueSortedData);

        System.out.println("Data after removing duplicates and sorting:");
        System.out.println(resultList);
	}

}
