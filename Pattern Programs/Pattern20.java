/*
	1000
	0100
	0010
	0001
 */

package com.edu.pattern;

public class Pattern20 {

	public static void main(String[] args) {

		int a,b;
		
		for(a=1; a<=4; a++) {
			for(b=1; b<=4; b++) {
				if(a==b)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}

	}

}
