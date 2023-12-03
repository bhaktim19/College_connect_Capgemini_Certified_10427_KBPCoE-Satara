/* 
        1 2 3 4 5
	2 3 4 5
	3 4 5
	4 5
	5
	              */

package com.edu.pattern;

public class Pattern12 {

	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			for(int b=a; b<=5; b++) {
				System.out.print(" "+b);
			}
			System.out.println();
		}

	}

}
