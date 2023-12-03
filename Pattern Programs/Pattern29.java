/*
		*
		##
		***
		####
		*****
 */

package com.edu.pattern;

public class Pattern29 {

	public static void main(String[] args) {
		
		int a,b;
		
		for(a=1; a<=5; a++) {
			for(b=a; b>=1; b--) {
				if(a%2==0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
