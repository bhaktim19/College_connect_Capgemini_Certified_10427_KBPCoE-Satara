	/* Pattern:	 1 2 3 4 5
			 1 2 3 4
			 1 2 3
			 1 2
			 1	*/

package com.edu.pattern;

public class Pattern4 {

	public static void main(String[] args) {
		
		for(int a=5; a>=1; a--) {
			for(int b=1; b<=a; b++) {
				System.out.print(" "+b);
			}
			System.out.println();
		}

	}

}
