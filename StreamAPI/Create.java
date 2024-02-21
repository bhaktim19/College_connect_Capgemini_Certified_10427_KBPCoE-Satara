package com.edu.stream;

import java.util.stream.Stream;

public class Create {

	public static void main(String[] args) {
		
		Stream<Integer>sm1=Stream.of(10,11,12,13,14,15);
		
		System.out.println("Elements of Integer stream:");
        sm1.forEach(System.out::println);
      
        Float arr[]={1.2f,7.3f,5.6f,3.2f,9.1f};
         
        Stream<Float> sm2=Stream.of(arr);
        
        System.out.println("Elements of Float stream:");
        sm2.forEach(System.out::println);

	}

}
