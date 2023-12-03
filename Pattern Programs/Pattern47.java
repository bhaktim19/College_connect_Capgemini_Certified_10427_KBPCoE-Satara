/*
		 543212345
		  5432345
		   54345
		    545
		     5
 */

package com.edu.pattern;

public class Pattern47 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		for(a=1; a<=5; a++) {
			for(c=1; c<=a; c++)
				System.out.print(" ");
			for(b=5; b>=a; b--)
				System.out.print(b);
			for(d=a+1; d<=5; d++)
				System.out.print(d);
			System.out.println();
			}

	}

}
