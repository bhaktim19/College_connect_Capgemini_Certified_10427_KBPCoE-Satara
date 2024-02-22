package com.edu.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringRotation {

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter the string");
        try {
            str = br.readLine();
        } catch (Exception e) {
            System.out.println("An I/O error occurred");
            return;
        }
        String str2;
        System.out.println("Enter the second string");
        try {
            str2 = br.readLine();
        } catch (Exception e) {
            System.out.println("An I/O error occurred");
            return;
        }
        if(str.length() != str2.length())
        {
           System.out.println("\nNo");
           return;
        }
        String str1=str;
        str1 += str;
        if(str1.indexOf(str2)!=-1)
        {
            System.out.println("\nYes");
        }
        else{
            System.out.println("\nNo");
        }

	}

}
