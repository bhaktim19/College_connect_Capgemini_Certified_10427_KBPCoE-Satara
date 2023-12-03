/*
		 543212345
		  4321234
		   32123
		    212
		     1
 */

package com.edu.pattern;

public class Pattern46 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		for(a=5; a>=1; a--) {
			for(c=a; c<=5; c++)
				System.out.print(" ");
			for(b=a; b>=1; b--)
				System.out.print(b);
			for(d=2; d<=a; d++)
				System.out.print(d);
			System.out.println();
			}

	}

}
