package com.edu.basicoperations;

public class RevWordSen {

	public static void main(String[] args) {
		
		String str = "I Love My India";
		
		String strarr[]=str.split(" ");
		
		for(String w:strarr) {
			//System.out.println(w);
			StringBuffer w1=new StringBuffer(w);
			String rew=w1.reverse().toString();
			System.out.print(rew+" ");
			
		}

	}

}
