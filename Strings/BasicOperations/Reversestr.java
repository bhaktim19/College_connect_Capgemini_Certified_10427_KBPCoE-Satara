package com.edu.basicoperations;

public class Reversestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Love My India";
		//output: aindI yM evoL I
		//String[] words = str.split(" ");
		
		StringBuffer bf = new StringBuffer(str);
		String revstr=bf.reverse().toString();
		System.out.println(revstr);
		

	}

}
