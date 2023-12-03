/*
			A       A
			AB     BA
			ABC   CBA
			ABCD DCBA
			ABCDEDCBA
 */

package com.edu.pattern;

public class Pattern57 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		for (a = 65; a <= 69; a++) {
		    StringBuilder sb = new StringBuilder();
		    for (b = 65; b <= a; b++) {
		        sb.append((char)b);
		    }
		    for (c = a; c < 69; c++) {
		        sb.append("  ");
		    }
		    sb.deleteCharAt(sb.length() - 1); // remove the extra space
		    for (d = a; d >= 65; d--) {
		        sb.append((char)d);
		    }
		    System.out.println(sb.toString());
		}

	}

}
