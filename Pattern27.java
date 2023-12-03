/*
		11111
		0000
		111
		00
		1
 */

package com.edu.pattern;

public class Pattern27 {

	public static void main(String[] args) {
		
		int a,b;
		
		for(a=5; a>=1; a--) {
			for(b=1; b<=a; b++) {
				if(a%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}

	}

}
