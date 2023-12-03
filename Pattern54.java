/*
		*********
		**** ****
		***   ***
		**     **
		*       *
		**     **
		***   ***
		**** ****
		*********
 */

package com.edu.pattern;

public class Pattern54 {

	public static void main(String[] args) {

			int a,b,c,d;
			for (a = 5; a >= 1; a--) {
			    StringBuilder sb = new StringBuilder();
			    for (b = 1; b <= a; b++) {
			        sb.append("*");
			    }
			    for (c = 5; c > a; c--) {
			        sb.append("  ");
			    }
			    sb.deleteCharAt(sb.length() - 1); // remove the extra space
			    for (d = a; d >= 1; d--) {
			        sb.append("*");
			    }
			    System.out.println(sb.toString());
			}
			for (a = 2; a <= 5; a++) {
			    StringBuilder sb = new StringBuilder();
			    for (b = 1; b <= a; b++) {
			        sb.append("*");
			    }
			    for (c = a; c < 5; c++) {
			        sb.append("  ");
			    }
			    sb.deleteCharAt(sb.length() - 1); // remove the extra space
			    for (d = a; d >= 1; d--) {
			        sb.append("*");
			    }
			    System.out.println(sb.toString());
			}
	}

}
