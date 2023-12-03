/*
		     1
		    212
		   32123
		  4321234
		 543212345
 */

package com.edu.pattern;

public class Pattern42 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		for(a=1; a<=5; a++) {
			for(c=a; c<=5;c++)
				System.out.print(" ");
			for(b=a; b>=1; b--)
				System.out.print(b);
			for(d=2; d<=a; d++)
				System.out.print(d);
			System.out.println();
			}
	}

}
