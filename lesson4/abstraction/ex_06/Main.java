package abstraction.ex_06;

public class Main {

	public static void main(String[] args) {
		AbstractClass instance = new ConcreteClass();
		
		System.out.println("----------------");
		
		instance.abstractMethod();
	}

}
