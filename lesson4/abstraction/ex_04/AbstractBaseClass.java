package abstraction.ex_04;

public abstract class AbstractBaseClass {

	public void simpleMethod() {
		
		System.out.println("AbstractBaseClass.simpleMethod");

	}
	
	public void overriddenMethod() {
		System.out.println("AbstractBaseClass.overriddenMethod");

	}
	
	public abstract void abstractMethod();
}
