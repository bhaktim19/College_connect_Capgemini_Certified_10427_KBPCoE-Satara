package com.edu.pattern;

/*
		ABCDEDCBA
		ABCD DCBA
		ABC   CBA
		AB     BA
		A       A
 */

public class Pattern51 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		for (a = 69; a >= 65; a--) {
		    StringBuilder sb = new StringBuilder();
		    for (b = 65; b <= a; b++) {
		        sb.append((char)b);
		    }
		    for (c = 69; c > a; c--) {
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
