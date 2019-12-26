package abstraction.ex_04;

public class Main {

	public static void main(String[] args) {
		AbstractBaseClass instance = new ConcreteDerivedClass();
		
		instance.abstractMethod();
		instance.overriddenMethod();
		instance.simpleMethod();
	}

}
