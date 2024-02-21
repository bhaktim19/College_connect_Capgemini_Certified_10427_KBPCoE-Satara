package com.edu;

public class InAmsterdam {

	public static void main(String[] args) {
		
		String ip = "I am in amsterdam am I?";
		System.out.println(countAm(ip));

	}
	public static int countAm(String str) {
        StringBuilder word = new StringBuilder();
        int count=0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    String w =word.toString();
                    word.setLength(0);
                    if (w.equalsIgnoreCase("am")) {
                        count++;
                }
            }
            }
           
        }
         return count;
    }


}
