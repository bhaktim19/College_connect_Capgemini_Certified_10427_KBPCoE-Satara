package com.edu;

import java.util.stream.Collectors;

public class BlankSpace {

	public static void main(String[] args) {
		
		String ip = "CAPGEMINI"; 
		String s = ip.chars()
				.mapToObj(c-> (char) c+" ")
				.collect(Collectors.joining())
				.trim();
		System.out.println(s);

	}

}
