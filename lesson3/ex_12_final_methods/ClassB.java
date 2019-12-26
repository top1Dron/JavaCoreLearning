package ex_12_final_methods;

public class ClassB extends ClassA {
	
	@Override
	public final void method1() {
		System.out.println("ClassB.method1");
	}
	
	@Override
	public void method2() {
		System.out.println("ClassB.method2");
	}
}
