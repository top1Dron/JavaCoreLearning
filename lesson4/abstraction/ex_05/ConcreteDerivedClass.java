package abstraction.ex_05;

public class ConcreteDerivedClass extends AbstractBaseClass{

//	if we will not override method, will be used 
//	realization from abstract class
//	cause method is not abstract
//	and have its realization
	
//	@Override
//	public void simpleMethod() {
//		System.out.println("ConcreteClass.simpleMethod");
//	}
	
	@Override
	public void abstractMethod() {
		System.out.println("ConcreteDerivedClass.abstractMethod");
		
	}

}
