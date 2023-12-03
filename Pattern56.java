/*
		123454321
		1234 4321
		123   321
		12     21
		1       1
		12     21
		123   321
		1234 4321
		123454321
 */
package com.edu.pattern;

public class Pattern56 {

	public static void main(String[] args) {

	
		int a,b,c,d;
		for (a = 5; a >= 1; a--) {
		    StringBuilder sb = new StringBuilder();
		    for (b = 1; b <= a; b++) {
		        sb.append(b);
		    }
		    for (c = 5; c > a; c--) {
		        sb.append("  ");
		    }
		    sb.deleteCharAt(sb.length() - 1); // remove the extra space
		    for (d = a; d >= 1; d--) {
		        sb.append(d);
		    }
		    System.out.println(sb.toString());
		}

		
		for (a = 2; a <= 5; a++) {
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
