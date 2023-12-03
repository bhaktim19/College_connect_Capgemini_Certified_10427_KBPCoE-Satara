/* Pattern:	1 2 3 4 5
 			1 2 3 4 5
 			1 2 3 4 5	*/
package com.edu.pattern;

public class Pattern1 {

	public static void main(String[] args) {
		
		for(int a=1; a<=3; a++) {
			for(int b=1; b<=5; b++) {
				System.out.print(" "+b);
			}
			System.out.println();
		}
	}

}
