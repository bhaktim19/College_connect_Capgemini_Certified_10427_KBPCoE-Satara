/*
	 1
	 2 3
	 4 5 6
	 7 8 9 10
 */

package com.edu.pattern;

public class Pattern19 {

	public static void main(String[] args) {
		
		int a,b,c=1;
		
		for(a=1; a<=4; a++) {
			for(b=1; b<=a; b++) {
				System.out.print(" "+c++);
			}
			System.out.println();
		}
	}

}
