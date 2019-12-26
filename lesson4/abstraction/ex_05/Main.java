package abstraction.ex_05;

public class Main {

	public static void main(String[] args) {
		AbstractBaseClass instance = new ConcreteDerivedClass();
		
		instance.abstractMethod();
		instance.simpleMethod();
	}

}
