package test_first_execution;

public class A {
	{
		System.out.println("In block 1");
	}
	
	static {
		System.out.println("In static block 1");
	}
	
	public A() {
		System.out.println("In constructor A");
	}
	
	{
		System.out.println("In block 2");
	}
	
	public static void main(String[] args) {
		A a = new A();
		A a2 = new A();
	}
}
