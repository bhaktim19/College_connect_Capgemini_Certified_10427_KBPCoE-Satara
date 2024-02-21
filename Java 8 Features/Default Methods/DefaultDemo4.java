package meth.def;

interface Interface{
	public void cube(int a);
	static void show() {
		System.out.println("Static method executed");
	}
}

class Cls implements Interface{

	@Override
	public void cube(int a) {
		System.out.println(a*a*a);
		
	}
	
}

public class DefaultDemo4 {

	public static void main(String[] args) {
		Cls obj = new Cls();
		obj.cube(2);
		Interface.show();

	}

}
