package com.edu.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedListNewCollection {

	public static void main(String[] args) {
		
        LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:"+arrl);
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        arrl.addAll(list);
        System.out.println("After Copy: "+arrl);

	}

}
