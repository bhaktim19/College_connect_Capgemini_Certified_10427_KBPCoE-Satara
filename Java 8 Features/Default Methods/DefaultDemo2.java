package meth.def;

interface One {
	default void message() {
		System.out.println("Hello from one");
	}
}

interface Two {
	default void message() {
		System.out.println("Hello from two");
	}
}

class ImpClass implements One,Two{

	@Override
	public void message() {
		Two.super.message();
	}
	
}

public class DefaultDemo2 {

	public static void main(String[] args) {
		
		ImpClass ic = new ImpClass();
		ic.message();
	}

}
