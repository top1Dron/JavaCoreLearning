package abstraction.ex_06;

public class ConcreteClass extends AbstractClass {

	String s = "First";
	
	public ConcreteClass() {
		System.out.println("3 ConcreteClass()");
		s = "Second";
	}

	@Override
	public void abstractMethod() {
		System.out.println("Method's realization abstractMethod() v ConcreteClass " + s);
	}

}
