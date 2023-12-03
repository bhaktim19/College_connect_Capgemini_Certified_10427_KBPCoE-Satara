/*
		     5
		    545
		   54345
		  5432345
		 543212345
 */

package com.edu.pattern;

public class Pattern43 {

	public static void main(String[] args) {
	
		int a,b,c,d;
		
		for(a=5; a>=1; a--) {
			for(c=a; c>=1; c--)
				System.out.print(" ");
			for(b=5; b>=a; b--)
				System.out.print(b);
			for(d=a+1; d<=5; d++)
				System.out.print(d);
			System.out.println();
			}
	}

}
