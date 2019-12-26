package ex_12_final_methods;

public class ClassC extends ClassB {

//	method1() is final in ClassB, so override isn't allowed 
//	@Override
//	public void method1() {
//		System.out.println("ClassC.method1");
//	}
	
//	overriding method2() allowed
	@Override
	public final void method2() {
		System.out.println("ClassC.method2");
	}
}
