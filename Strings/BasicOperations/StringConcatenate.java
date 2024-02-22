package com.edu.basicoperations;

import java.util.Scanner;

public class StringConcatenate {

	public static void main(String[] args) {
		
        String a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first string:");
        a = s.nextLine();
        System.out.print("Enter second string:");
        b = s.nextLine();
        StringConcatenate obj = new  StringConcatenate();
        c = obj.concat(a, b);
        System.out.println("New String:"+c);

	}
    String concat(String x, String y)
    {
        String z;
        z = x + " " + y;
        return z;
    }

}
