/*
	1
	10
	101
	1010
	10101
 */

package com.edu.pattern;

public class Pattern22 {

	public static void main(String[] args) {
		
		int a,b;
		
		for(a=1; a<=5; a++) {
			for(b=1; b<=a; b++) {
				System.out.print(b%2);
			}
			System.out.println();
		}

	}

}
