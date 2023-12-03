/*
		    1 
		   2 3 
		  4 5 6 
		 7 8 9 10 
 */

package com.edu.pattern;

public class Pattern39 {

	public static void main(String[] args) {
		
		int a,b,c,d=1;
		
		for(a=1; a<=4; a++) {
			for(c=a; c<=4;c++)
				System.out.print(" ");
			for(b=1; b<=a; b++)
				System.out.print(d+++" ");
			System.out.println();
			}

	}

}
