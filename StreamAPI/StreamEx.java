package com.edu.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//count  the number of strings with length more than 4 characters
public class StreamEx {

	public static void main(String[] args) {
		
		List<String>lst =Arrays.asList("USA","Japan","India","China", "","Russia","uk");
		Stream <String> sobj = lst.stream();
		
		long cnt= sobj.filter(n->n.length()>4).count();
		System.out.println("No. of strings having char count more than 4: "+cnt);
		
	}

}
