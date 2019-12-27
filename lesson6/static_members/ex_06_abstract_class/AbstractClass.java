package static_members.ex_06_abstract_class;

public abstract class AbstractClass {
	
	//static factory's method
	public static AbstractClass CreateObject() {
		return new ConcreteClass();
	}
	
	public abstract void method();
}
