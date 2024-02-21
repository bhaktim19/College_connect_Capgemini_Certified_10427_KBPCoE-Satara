package function;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		
		Function<String, Integer> len = (str) -> str.length();
		
		String str = "Bhakti";
		
		System.out.println("Length of string str = "+len.apply(str));

	}

}
