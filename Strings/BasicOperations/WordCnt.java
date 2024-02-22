package com.edu.basicoperations;

import java.util.Scanner;

public class WordCnt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String ip = sc.nextLine();
		String arr[] = ip.split(" ");
		System.out.println("Number of words in a string: "+arr.length);

	}

}
