package com.edu.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongestRepeatingSubsequence {
	
    static int lengthOfLRS(String str){
        int[][] M = new int[str.length()+1][str.length()+1];
        for(int i=1;i<=str.length();i++){
            for(int j=1;j<=str.length();j++){
                if(str.charAt(i-1) == str.charAt(j-1) && i!=j){
                    M[i][j] = M[i-1][j-1] + 1;
                }
                else
                {
                    M[i][j] = Math.max(M[i-1][j],M[i][j-1]);
                }
            }
        }
        return M[str.length()][str.length()];
    }

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter a string");
        try{
            str = br.readLine();
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        int x=lengthOfLRS(str);
        System.out.println("The length of the longest repeating subsequence is "+ x);

	}

}
