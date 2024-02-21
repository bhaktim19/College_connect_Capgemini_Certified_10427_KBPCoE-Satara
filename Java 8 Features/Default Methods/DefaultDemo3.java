package meth.def;

interface MyInterface{
	public void square(int a);
	default void show() {
		System.out.println("Default method executed");
	}
}

class MyCls implements MyInterface{
	
	@Override
	public void square(int a) {
		System.out.println(a*a);
	}
	
}

public class DefaultDemo3 {

	public static void main(String[] args) {
		MyCls obj = new MyCls();
		obj.square(4);
		obj.show();

	}

}
