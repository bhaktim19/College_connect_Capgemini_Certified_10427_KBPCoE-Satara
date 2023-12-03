/*
		1       1
		12     21
		123   321
		1234 4321
		123454321
 */

package com.edu.pattern;

public class Pattern55 {
	public static void main (String[] args) {
		
		int a,b,c,d;
		for (a = 1; a <= 5; a++) {
	    StringBuilder sb = new StringBuilder();
	    for (b = 1; b <= a; b++) {
	        sb.append(b);
	    }
	    for (c = a; c < 5; c++) {
	        sb.append("  ");
	    }
	    sb.deleteCharAt(sb.length() - 1); // remove the extra space
	    for (d = a; d >= 1; d--) {
	        sb.append(d);
	    }
	    System.out.println(sb.toString());
	
	}
}

}
