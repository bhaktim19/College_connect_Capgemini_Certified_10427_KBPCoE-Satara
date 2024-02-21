package predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		Predicate<Integer> gt = (i) -> i>10 ;
		boolean res = gt.test(15);
		System.out.println("Number greater than 10: "+res);

	}

}
