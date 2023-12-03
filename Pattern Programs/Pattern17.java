/*
	A
	AB
	ABC
	ABCD
	ABCDE
 */

package com.edu.pattern;

public class Pattern17 {

	public static void main(String[] args) {
		
		int a,b;
		
		for(a=65; a<=69; a++) {
			for(b=65; b<=a; b++) {
				System.out.print((char)b);
			}
			System.out.println();
		}

	}

}
