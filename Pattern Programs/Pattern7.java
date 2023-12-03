/* Pattern: *
			**
			***
			****
			*****
			****
			***
			**
			*    */

package com.edu.pattern;

public class Pattern7 {

	public static void main(String[] args) {
		
		int a,b;
		for( a=1; a<=5; a++) {
			for( b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for( a=a-2; a>=1; a--) {
			for( b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
