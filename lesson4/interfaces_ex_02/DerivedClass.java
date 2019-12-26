package interfaces_ex_02;

public class DerivedClass implements IInterface1, IInterface2 {

	@Override
	public void method1() {
		
		System.out.println("method1() method's realization from IInterface1");
		
	}

	@Override
	public void method2() {
		
		System.out.println("method2() method's realization from IInterface2");
	}

}
