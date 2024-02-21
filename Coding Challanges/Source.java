package com.edu;

import java.util.HashMap;
import java.util.Map;

public class Source {

	public static Map<Character,Integer> countChars(char arr[]) {
		// {'a','f','c','d','a','c'};
		Map<Character,Integer> charHashMap = new HashMap<Character,Integer>();
		System.out.println(charHashMap);
		for(char c:arr) { //a
			//System.out.println(c);
			if(charHashMap.containsKey(c)) {
				charHashMap.put(c,charHashMap.get(c)+1);//1+1 {a-2,c=2,d=1,f=1}
				//increment the value
			}else {
				//char not exists in HashMap
				//put the char and value as
				charHashMap.put(c, 1);  // {a=2.f=1,c=1,d=1}
			}
		}
		return charHashMap;
		
	}
	public static void main(String[] args) {
		char [] arr= {'a','f','c','d','a','c'};
		
		Map<Character,Integer> cnt = countChars(arr);
		System.out.println(cnt);
	}

}
