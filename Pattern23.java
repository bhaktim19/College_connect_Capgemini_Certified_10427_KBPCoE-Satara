/*
	1
	01
	101
	0101
	10101
 */

package com.edu.pattern;

public class Pattern23 {

	public static void main(String[] args) {

		int a,b;
		
		for(a=1; a<=5; a++) {
			for(b=a; b>=1; b--) {
				if(b%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}

}
