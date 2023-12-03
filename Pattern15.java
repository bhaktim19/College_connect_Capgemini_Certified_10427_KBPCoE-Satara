/*
	 1
	 2 2
	 3 3 3
	 4 4 4 4
	 5 5 5 5 5
 */

package com.edu.pattern;

public class Pattern15 {

	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(" "+a);
			}
			System.out.println();
		}

	}

}
