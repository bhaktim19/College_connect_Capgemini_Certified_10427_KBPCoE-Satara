package com.edu.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MainAppList {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(4);
		alist.add(8);
		alist.add(10);
		alist.add(74);
		alist.add(65);
		
		System.out.println(alist);
		
		for(int i : alist) {
			System.out.println(i);
		}
		
		// using iterator interface
		System.out.println("Using Iterator Interface :");
		Iterator<Integer> itobj = alist.iterator();
		while(itobj.hasNext()) {
			System.out.println(itobj.next());
		}

	}

}
