package interfaces.ex_07;

interface IInterface{
	void method();
}

abstract class AbstractClass implements IInterface{
	public abstract void method();
}

class ConcreteClass extends AbstractClass{

	@Override
	public void method() {
		System.out.println("Method - interface's realization in concrete class");
	}
	
}

public class Main {

	public static void main(String[] args) {
		ConcreteClass instance = new ConcreteClass();
		
		instance.method();
	}

}
