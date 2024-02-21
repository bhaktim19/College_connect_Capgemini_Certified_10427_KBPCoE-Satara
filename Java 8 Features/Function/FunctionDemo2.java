package function;

import java.util.function.Function;

public class FunctionDemo2 {
	
	static String show(String msg) {
		return "Hello "+msg;
	}

	public static void main(String[] args) {
		
		Function<String, String> str = FunctionDemo2::show;
		System.out.println(str.apply("Bhakti"));

	}

}
