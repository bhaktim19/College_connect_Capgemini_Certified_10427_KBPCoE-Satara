package com.edu.basicoperations;

public class BlankEmpty {

	public static void main(String[] args) {
		String s = "";
		String s1= " ";
		if(s.isEmpty()) {
			System.out.println("Empty");
		}
		if(s1.isBlank()) {
			System.out.println("Blank");
		}
	}

}
