package anonymous.ex_05_anonymous_classes;

interface Interface {
	void method();
	
	int getValue();
}

public class Main {

	public static void main(String[] args) {
		Interface instance = new Interface() {
			int field;
			
			@Override
			public void method() {
				field = 100;
			}
			
			@Override
			public int getValue() {
				return field;
			}
		};
		
		Interface instance2 = new Interface() {
			int field = -1;
			
			@Override
			public void method() {
				field = instance.getValue();
			}
			
			@Override
			public int getValue() {
				 return field;
			}
		};
		
		instance.method();
		instance2.method();
		System.out.println(instance.getValue() + " " + instance2.getValue());
	}

}
