package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo3 {
	
	static int addLst(List<Integer> lst) {
		return lst.stream()
				.mapToInt(Integer::intValue)
				.sum();
	}

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		
		Function<List<Integer>, Integer> obj = FunctionDemo3::addLst;
		int res = obj.apply(lst);
		System.out.println("Sum = "+res);
		

	}

}
