package com.edu.basicoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToIntegerArray {
	
    static int[] toIntegerArray(String str){
        int String[];
        java.lang.String[] splitArray = str.split(" ");
        int[] array = new int[splitArray.length];
        for(int i=0;i<splitArray.length;i++)
        {
                try {
                    array[i] = Integer.parseInt(splitArray[i]);
                } catch (NumberFormatException e) {
                    array[i]=-1;
                }
        }
        return array;
    }

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter the string");
        try {
            str = br.readLine();
        }
        catch (IOException e){
            System.out.println("An I/O error occurred");
            return;
        }
        int i;
        int[] array=toIntegerArray(str);
        System.out.println("The contents of the array are");
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+" ");

	}

}}
