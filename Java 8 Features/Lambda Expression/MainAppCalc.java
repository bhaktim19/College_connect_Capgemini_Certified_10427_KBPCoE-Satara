package com.edu.lambda;

@FunctionalInterface
interface Sub{
	void subtraction();
}

@FunctionalInterface
interface Mul{
	void multiplication();
}

@FunctionalInterface
interface Div{
	void division();
}

public class MainAppCalc {

	public static void main(String[] args) {
		
		Add ob1=()->{
			int s,a,b;
			   	a=10;
				b=9;
				s=a+b;
				System.out.println("sum = "+s);
				
		};
		ob1.addition();	
		
		Sub ob2 = ()->{
			int s,a,b;
			a=10;
			b=5;
			s=a-b;
			System.out.println("Sub = "+s);
		};
		ob2.subtraction();
		
		Mul ob3 = ()->{
			int m,a,b;
			a=10;
			b=5;
			m=a*b;
			System.out.println("Multiplication = "+m);
		};
		ob3.multiplication();
		
		Div ob4 = ()->{
			int d,a,b;
			a=10;
			b=5;
			d=a/b;
			System.out.println("Division = "+d);
		};
		ob4.division();
		
	}

}
