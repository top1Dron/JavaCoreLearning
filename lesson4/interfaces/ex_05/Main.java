package interfaces.ex_05;

interface IInterface1{
	void method();
}

interface IInterface2{
	void method();
}

class ConcreteClass implements IInterface1, IInterface2{

	@Override
	public void method() {
		System.out.println("method - realization of interface(1-2)");
	}
	
}


public class Main {

	public static void main(String[] args) {
		ConcreteClass instance = new ConcreteClass();
		instance.method();
		
		IInterface1 instance1 = instance;
		instance1.method();
		
		IInterface2 instance2 = instance;
		instance2.method();

	}

}
