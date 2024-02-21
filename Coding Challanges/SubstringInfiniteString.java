package com.edu;

import java.util.Scanner;

public class SubstringInfiniteString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String infStr = sc.next();
        String toFind = sc.next();
        System.out.println(isSubstring(infStr,toFind ));
		

	}
	
	public static boolean isSubstring(String infStr, String toFind) {
		int infStrLength = infStr.length();
	    int toFindLength = toFind.length();

	    for (int i = 0; i < infStrLength; i++) {
	        for (int j = 0; j < infStrLength - toFindLength + 1; j++) {
	            String subString = infStr.substring(j, j + toFindLength);
	            if (subString.equals(toFind)) 
	                return true;
	        }
	    }
		return false;
	}
	
}