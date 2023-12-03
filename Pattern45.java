/*
		 123454321
		  1234321
		   12321
		    121
		     1
 */

package com.edu.pattern;

public class Pattern45 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		for(a=5; a>=1; a--) {
			for(c=a; c<=5; c++)
				System.out.print(" ");
			for(b=1; b<=a; b++)
				System.out.print(b);
			for(d=a-1; d>=1; d--)
				System.out.print(d);
			System.out.println();
			}

	}

}
