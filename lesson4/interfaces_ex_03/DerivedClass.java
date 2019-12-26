package interfaces_ex_03;

public class DerivedClass extends BaseClass implements IInterface1, IInterface2 {

	@Override
	public void method2() {
		
		System.out.println("method2() method's realization from IInterface2");
	}

	@Override
	public void method1() {
		
		System.out.println("method1() method's realization from IInterface1");
	}

}
