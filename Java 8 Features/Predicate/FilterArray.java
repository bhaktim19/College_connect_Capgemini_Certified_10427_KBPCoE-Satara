package predicate;

import java.util.function.Predicate;

public class FilterArray {

	public static void main(String[] args) {
		Integer []arr={8,9,10,15,23,43,78,32};
		Predicate<Integer>gt=(i) -> i>10;
  
		System.out.println("Numbers greater than 10 :");
		myMethod(gt,arr);
       
		}
		static void myMethod(Predicate<Integer> p, Integer []arr)
		{
			for(Integer i:arr){
               if(p.test(i)) System.out.print(i+" ");
        }

	}

}
