package com.edu.lambda;

@FunctionalInterface
interface Add{
	void addition();
}

public class MainAppAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lambda Expression which takes no arg
		Add ob1=()->{
			int s,a,b;
			   	a=10;
				b=9;
				s=a+b;
				System.out.println("sum ="+s);
				
		};
		ob1.addition();		

	}

}
