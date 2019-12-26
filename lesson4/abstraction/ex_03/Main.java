package abstraction.ex_03;

public class Main {

	public static void main(String[] args) {
		AbstractClassA instanceA = new ConcreteClass();
		AbstractClassB instanceB = new ConcreteClass();
		
		instanceA.operationA();
//		instanceA.operationB();
		
		instanceB.operationA(); //AbstractClassB extends AbstractClassA
		instanceB.operationB();
	}

}
