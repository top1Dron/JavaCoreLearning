package ex_10_super_method;

public class DerivedClass extends BaseClass {
	
	@Override
	public void method() {
		super.method();
		System.out.println("method from DerivedClass");
	}
}
