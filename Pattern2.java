/* Pattern:	 1
 			 1 2
			 1 2 3
			 1 2 3 4
			 1 2 3 4 5	*/

package com.edu.pattern;

public class Pattern2 {

	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(" "+b);
			}
			System.out.println();
		}
	}

}
