/*
		 123454321
		  2345432
		   34543
		    454
		     5
 */

package com.edu.pattern;

public class Pattern48 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		for(a=1; a<=5; a++) {
			for(c=1; c<=a; c++)
				System.out.print(" ");
			for(b=a; b<=5; b++)
				System.out.print(b);
			for(d=4; d>=a; d--)
				System.out.print(d);
			System.out.println();
			}

	}

}
