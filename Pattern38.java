/*
			 * * * * * * * 
			   * * * * * 
			     * * * 
			       * 
 */

package com.edu.pattern;

public class Pattern38 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		for(a=7; a>=1; a-=2) {
			for(c=a; c<=7;c++)
				System.out.print(" ");
			for(b=1; b<=a; b++)
				System.out.print("* ");
			System.out.println();
			}

	}

}
