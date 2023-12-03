/*
	 *****
	  ****
	   ***
	    **
	     *
 */

package com.edu.pattern;

public class Pattern34 {

	public static void main(String[] args) {


		int a,b,c;
		
		for(a=5; a>=1; a--) {
			for(c=a; c<=5;c++)
				System.out.print(" ");
			for(b=1; b<=a; b++)
				System.out.print("*");
			System.out.println();
			}

	}

}
