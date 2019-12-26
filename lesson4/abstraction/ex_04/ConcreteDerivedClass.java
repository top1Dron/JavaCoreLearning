package abstraction.ex_04;

public class ConcreteDerivedClass extends AbstractBaseClass{

	@Override
	public void abstractMethod() {
		System.out.println("ConcreteDerivedClass.abstractMethod");
		
	}

	@Override
	public void overriddenMethod() {
		System.out.println("ConcreteDerivedClass.overriddenMethod");
		
	}

}
