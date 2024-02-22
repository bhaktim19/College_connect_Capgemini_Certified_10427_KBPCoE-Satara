package com.edu.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println(a+ " is a palindrome.");
        }
        else
        {
            System.out.println(a+ " is not a palindrome.");
        }

	}

}
