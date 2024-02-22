package com.edu.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FirstIndexes {
	
    static void firstIndexes(String str){
        boolean consonant,vowel,capital,small,special,number,space;
        consonant = vowel = capital = small = special = number = space =false;
        int i;
        char ch;
        int count = 0;
        for(i=0; i<str.length(); i++){
            if(count == 7)
                break;
            ch = str.charAt(i);
            if(!space && ch == ' '){
                System.out.println("The index of first whitespace is " + (i+1));
                space = true;
                count++;
            }
            else if(!number && Character.isDigit(ch)){
                System.out.println("The index of first number is " + (i+1));
                number = true;
                count++;
            }
            if(Character.isLetter(ch)){
                if(!small && Character.isLowerCase(ch)){
                    System.out.println("The index of first lowercase character is "
                                                                          + (i+1));
                    small = true;
                    count++;
                }
                else if(!capital && Character.isUpperCase(ch)){
                    System.out.println("The index of first uppercase character is "
                                                                          + (i+1));
                    capital = true;
                    count++;
                }
                if(!vowel || !consonant){
                    ch = Character.toLowerCase(ch);
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                                                           || ch == 'u'){
                        System.out.println("The index of first vowel is "
                                                                 + (i+1));
                        vowel = true;
                        count++;
                    }
                    else{
                        System.out.println("The index of first consonant is "
                                                                      + (i+1));
                        consonant = true;
                        count++;
                    }
                }
            }
            else if(!special && ch != ' '){
                System.out.println("The index of first special character is "
                                                                     + (i+1));
                special = true;
                count++;
            }
        }
    }

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
        System.out.println("The first indexes are");
        firstIndexes(str);
    }

}


