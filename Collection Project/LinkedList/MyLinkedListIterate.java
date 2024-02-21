package com.edu.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListIterate {

	public static void main(String[] args) {
		
        LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        Iterator<String> itr = arrl.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

	}

}
