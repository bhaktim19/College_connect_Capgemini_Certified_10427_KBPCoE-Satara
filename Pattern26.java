/*
		1
		00
		111
		0000
		11111
 */

package com.edu.pattern;

public class Pattern26 {

	public static void main(String[] args) {
		
		int a,b;
		
		for(a=1; a<=5; a++) {
			for(b=a; b>=1; b--) {
				if(a%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}

	}

}
