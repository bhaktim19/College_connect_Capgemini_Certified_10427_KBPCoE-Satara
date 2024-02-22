package com.edu.basicoperations;

public class ReverseNo {

	public static void main(String[] args) {
		int num=23345;
		//Integer.parseInt()//String to integer
		String s= String.valueOf(num);
		StringBuffer bf = new StringBuffer(s);
		
		String revnum = bf.reverse().toString();
		
		int rn=Integer.parseInt(revnum);
		System.out.println("Reverse number is "+rn);

	}

}
