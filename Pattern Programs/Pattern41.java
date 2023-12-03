/*
		     1
		    121
		   12321
		  1234321
		 123454321
 
 */
package com.edu.pattern;

public class Pattern41 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		for(a=1; a<=5; a++) {
			for(c=5; c>=a;c--)
				System.out.print(" ");
			for(b=1; b<=a; b++)
				System.out.print(b);
			for(d=a-1; d>=1; d--)
				System.out.print(d);
			System.out.println();
			}

	}

}
