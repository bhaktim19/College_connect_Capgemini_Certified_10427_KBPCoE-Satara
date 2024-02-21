package meth.def;

interface MyInter{
	int add(int x, int y);
	default int mul(int x, int y) {
		return (x*y);
	}
}

class MyClass implements MyInter{

	@Override
	public int add(int x, int y) {
		return x+y;
	}
	
}

public class DefaultDemo1 {

	public static void main(String[] args) {
		MyInter mi = new MyClass();
		System.out.println("Sum = "+mi.add(10,20));
		System.out.println("Mul = "+mi.mul(10, 20));

	}

}
