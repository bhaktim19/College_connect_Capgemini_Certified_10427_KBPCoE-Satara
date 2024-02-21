package com.edu.stream;
import java.util.stream.Stream;

public class Random {

	public static void main(String[] args) {
		
		Stream<Double>sm=Stream.generate(()->{return Math.random();});
		//Display the elements of the stream
		sm.forEach(System.out::println);
		   
	}

}
