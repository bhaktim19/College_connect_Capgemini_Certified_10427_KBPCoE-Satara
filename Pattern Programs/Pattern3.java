	/* Pattern:	 1
			 2 1
			 3 2 1
			 4 3 2 1
			 5 4 3 2 1	*/

package com.edu.pattern;

public class Pattern3 {

	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			for(int b=a; b>=1; b--) {
				System.out.print(" "+b);
			}
			System.out.println();
		}
	}

}
