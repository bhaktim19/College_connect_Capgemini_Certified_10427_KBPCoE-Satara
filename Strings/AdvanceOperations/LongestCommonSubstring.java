package com.edu.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonSubstring {
    public String lcs(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
 
        int[][] arr = new int[l1 + 1][l2 + 1];
        int len = 0, pos = -1;
 
        for (int x = 1; x < l1 + 1; x++)
        {
            for (int y = 1; y < l2 + 1; y++)
            {
                if (str1.charAt(x - 1) == str2.charAt(y - 1))
                {
                        arr[x][y] = arr[x - 1][y - 1] + 1;
                        if (arr[x][y] > len)
                        {
                            len = arr[x][y];
                            pos = x;
                        }               
                }
                else
                    arr[x][y] = 0;
            }
        }        
 
        return str1.substring(pos - len, pos);
    }
 
   
    public static void main(String[] args) throws IOException
    {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Longest Common Substring Algorithm Test\n");
 
        System.out.println("\nEnter string 1");
        String str1 = br.readLine();
 
        System.out.println("\nEnter string 2");
        String str2 = br.readLine();
 
        LongestCommonSubstring obj = new LongestCommonSubstring(); 
        String result = obj.lcs(str1, str2);
 
        System.out.println("\nLongest Common Substring : "+ result);
    }

}
