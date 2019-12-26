package abstraction.ex_03;

public class ConcreteClass extends AbstractClassB {

	@Override
	public void operationA() {
		System.out.println("ConcreteClass.operationA");
	}

	@Override
	public void operationB() {
		System.out.println("ConcreteClass.operationB");
	}

}
