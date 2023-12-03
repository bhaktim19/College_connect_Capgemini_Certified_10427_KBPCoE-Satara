/*  5 4 3 2 1
	4 3 2 1
	3 2 1
	2 1
	1  */

package com.edu.pattern;

public class Pattern11 {

	public static void main(String[] args) {
		
		for(int a=5; a>=1; a--) {
			for(int b=a; b>=1; b--) {
				System.out.print(" "+b);
			}
			System.out.println();
		}

	}

}
