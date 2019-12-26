package abstraction.ex_02;

public class Main {

	public static void main(String[] args) {
		AbstractClass instance = new ConcreteClassB();
		
		instance.method();
		instance.operation();
	}

}
