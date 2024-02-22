package com.edu.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NonRepeatedCharacter {
	
    static int firstNonRepeatingCharacter(String str){
        int[] arrayCount = new int[256];
        int[] arrayIndex = new int[256];
        int i;
        for(i=0; i<str.length(); i++){
            arrayCount[str.charAt(i)]++;
            arrayIndex[str.charAt(i)] = i;
        }
        int index = Integer.MAX_VALUE;
        for(i=0; i<256; i++){
            if(arrayCount[i] == 1 && arrayIndex[i] < index)
                index = arrayIndex[i];
        }
        return index;
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
        int index = firstNonRepeatingCharacter(str);
        if(index < str.length())
            System.out.println("First Non Repeating Character is "
                                              + str.charAt(index));
        else
            System.out.println("Each character is repeated");

	}

}
