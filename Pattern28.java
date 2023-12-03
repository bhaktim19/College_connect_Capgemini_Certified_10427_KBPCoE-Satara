/*
		*****
		####
		***
		##
		*
 */

package com.edu.pattern;

public class Pattern28 {

	public static void main(String[] args) {
		
		int a,b;
		
		for(a=5; a>=1; a--) {
			for(b=1; b<=a; b++) {
				if(a%2==0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
