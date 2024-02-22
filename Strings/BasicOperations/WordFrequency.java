package com.edu.basicoperations;

import java.util.Scanner;

public class WordFrequency
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        System.out.println("Enter a word:");
        String ipWord = in.nextLine();
        str += " ";
        String word = "";
        int count = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {

                if (word.equalsIgnoreCase(ipWord))
                    count++ ;

                word = "";
            }
            else {
                word += str.charAt(i);
            }
        }
       
        
        if (count > 0) {
            System.out.println(ipWord + " is present " + count + " times.");
        }
        else {
            System.out.println(ipWord + " is not present in sentence.");
        }
        
    }
}
