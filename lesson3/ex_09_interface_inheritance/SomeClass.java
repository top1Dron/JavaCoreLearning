package ex_09_interface_inheritance;

public class SomeClass implements SomeInterface1, SomeInterface2, SomeInterface3 {

	@Override
	public void method3() {
		System.out.println("method3");

	}

	@Override
	public void method2() {
		System.out.println("method2");

	}

	@Override
	public void method1() {
		System.out.println("method1");
	}

}
