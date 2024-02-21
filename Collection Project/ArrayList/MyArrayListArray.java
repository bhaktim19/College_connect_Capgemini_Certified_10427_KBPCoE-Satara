package com.edu.arraylist;

import java.util.ArrayList;

public class MyArrayListArray {
//Copying arraylist to an array
	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }

	}

}
