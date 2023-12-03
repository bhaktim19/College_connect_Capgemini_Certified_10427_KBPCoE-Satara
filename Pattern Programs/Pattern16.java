/*
	 5 5 5 5 5
	 4 4 4 4
	 3 3 3
	 2 2
	 1
 */
package com.edu.pattern;

public class Pattern16 {

	public static void main(String[] args) {
		
		int a,b;
		
		for( a=5; a>=1; a--) {
			for( b=1; b<=a; b++) {
				System.out.print(" "+a);
			}
			System.out.println();
		}

	}

}
