/*
		     1
		    101
		   10001
		  1000001
		 100000001
		  1000001
		   10001
		    101
		     1
 */

package com.edu.pattern;

public class Pattern49 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		for(a=5; a>=1; a--) {
			for (c=a; c>=1; c--)
				System.out.print(" ");
			for(b=5; b>=a; b--) {
				if(b==5)
					System.out.print("1");
				else
					System.out.print("0");
			}
			for(d=a+1; d<=5; d++) {
				if(d==5)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
		
		for(a+=2; a<=5; a++) {
			for (c=1; c<=a; c++)
				System.out.print(" ");
			for(b=5; b>=a; b--) {
				if(b==5)
					System.out.print("1");
				else
					System.out.print("0");
			}
			for(d=a+1; d<=5; d++) {
				if(d==5)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}

	}

}
