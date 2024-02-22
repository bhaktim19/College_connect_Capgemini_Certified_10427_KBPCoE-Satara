package com.edu.basicoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveMaskChar {
	
    static String removeMaskCharacters(String str, String str2){
        int[] array = new int[256];
        int i;
        for(i=0; i<str2.length(); i++){
            array[str2.charAt(i)]++;
        }
        String output="";
        for(i=0; i<str.length(); i++){
            if(array[str.charAt(i)] == 0)
                output+=str.charAt(i);
        }
        return output;
    }

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter the string");
        try {
            str = br.readLine();
        } catch (IOException e) {
            System.out.println("An I/O error occurred");
            return;
        }
        String str2;
        System.out.println("Enter the second string");
        try {
            str2 = br.readLine();
        } catch (IOException e) {
            System.out.println("An I/O error occurred");
            return;
        }
        String output = removeMaskCharacters(str,str2);
        System.out.println("Final String is " + output);

	}

}
