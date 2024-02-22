package com.edu.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class LongestNonRepeatedSubstring {
	
    static String longestSubstring(String str){
        Stack<Character> stack = new Stack<>();
        int last = 1;
        int prev = 0;
        String ans = "";
        int i;
        int max = -1;
        stack.push(str.charAt(0));
        for(i=1; i<str.length(); i++){
            if(stack.search(str.charAt(i)) != -1){
                if((i-prev) > max){
                    ans = str.substring(prev, i);
                    max = i-prev;
                }
                prev  = i;
                stack.clear();
                stack.push(str.charAt(i));
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        if((i-prev) > max){
            ans = str.substring(prev, i);
        }
        return ans;
    }

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter the text string");
        try{
            str = br.readLine();
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        String ans = longestSubstring(str);
        System.out.println("The longest substring without any repeated"+ " characters is " + ans);
		

	}

}
