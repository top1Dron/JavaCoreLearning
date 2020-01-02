package anonymous.ex_06_anonymous_classes;

interface Interface {
	void method();
	
	int getValue();
}

class ConcreteClass implements Interface{
	protected int protectedField = 10;
	
	@Override
	public void method() {
		System.out.println("ConcreteClass: method()");
	}

	@Override
	public int getValue() {
		return protectedField;
	}
	
}

public class Main {

	public static void main(String[] args) {
		ConcreteClass instance1 = new ConcreteClass() {
			
			@Override
			public void method() {
				System.out.println("instance1: method()");
			}
		};
		
		Interface instance2 = new ConcreteClass() {
			int protectedField = 3;
			
			@Override
			public void method() {
				System.out.println("instance2: method()");
			}
			
			@Override
			public int getValue() {
				return this.protectedField + super.getValue();
			}
		};
		
		instance1.method();
		instance2.method();
		
		System.out.println("instance1: publicField = " + instance1.getValue() + " instance2: publicField = " + instance2.getValue());
	}

}
