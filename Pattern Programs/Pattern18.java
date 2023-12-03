/*
	A
	BA
	CBA
	DCBA
	EDCBA
 */

package com.edu.pattern;

public class Pattern18 {

	public static void main(String[] args) {
		
		int a,b;
		
		for(a=65; a<=69; a++) {
			for(b=a; b>=65; b--) {
				System.out.print((char)b);
			}
			System.out.println();
		}

	}

}
