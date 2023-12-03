/*
		     5
		    454
		   34543
		  2345432
		 123454321
 */

package com.edu.pattern;

public class Pattern44 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		for(a=5; a>=1; a--) {
			for(c=a; c>=1; c--)
				System.out.print(" ");
			for(b=a; b<=5; b++)
				System.out.print(b);
			for(d=4; d>=a; d--)
				System.out.print(d);
			System.out.println();
			}
	}

}
