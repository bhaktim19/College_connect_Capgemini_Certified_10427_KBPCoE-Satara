/*
	0001
	0010
	0100
	1000
 */

package com.edu.pattern;

public class Pattern21 {

	public static void main(String[] args) {
		
		int a,b;
		
		for(a=1; a<=4; a++) {
			for(b=4; b>=1; b--) {
				if(a==b)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}

	}

}
