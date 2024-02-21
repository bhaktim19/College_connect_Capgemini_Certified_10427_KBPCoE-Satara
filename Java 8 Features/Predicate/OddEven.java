package predicate;

import java.util.function.Predicate;

public class OddEven {

	public static void main(String[] args) {
		
		Integer arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		Predicate<Integer> all, even, odd;
		all = (n)-> true;
		even = (n) -> n%2==0;
		odd = (n) -> n%2!=0;
		
		System.out.println("All Numbers: ");
		display(all,arr);
		System.out.println("All Odd Numbers: ");
		display(odd, arr);
		System.out.println("All Even Numbers: ");
		display(even, arr);

	}
	
    static void display(Predicate<Integer> p, Integer []arr){
        for(Integer i:arr){
           if(p.test(i)) System.out.print(i+" ");
         }
        System.out.println();
 }

}
