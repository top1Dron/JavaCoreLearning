package interfaces_ex_04;

interface IInterface1{
	void method1();
}

interface IInterface2 extends IInterface1{
	void method2();
}

class ConcreteClass implements IInterface2{

	@Override
	public void method1() {
		System.out.println("method1() method's realization of interface IInterface1");
		
	}

	@Override
	public void method2() {
		System.out.println("method2() method's realization of interface IInterface2");
	}
	
}

public class Main {

	public static void main(String[] args) {
		ConcreteClass instance = new ConcreteClass();
		instance.method1();
		instance.method2();
		
		IInterface1 iInterface1 = instance;
		IInterface2 iInterface2 = instance;
		
		iInterface1.method1();
		
		iInterface2.method1();
		iInterface2.method2();

	}

}
