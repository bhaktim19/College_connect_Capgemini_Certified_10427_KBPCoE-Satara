/*
	     1
	    12
	   123
	  1234
	 12345 
 */

package com.edu.pattern;

public class Pattern32 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		for(a=1; a<=5; a++) {
			for(c=a; c<=5;c++)
				System.out.print(" ");
			for(b=1; b<=a; b++)
				System.out.print(b);
			System.out.println();
			}
			
		}

}
