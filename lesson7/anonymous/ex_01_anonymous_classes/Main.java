package anonymous.ex_01_anonymous_classes;

interface IInterface{
	void method();
}

public class Main {

	public static void main(String[] args) {
		IInterface instance = new IInterface() {
			
			@Override
			public void method() {
				System.out.println("Call method() from anonymous class");
			}
		};
		
		System.out.println(instance.getClass().toString());
		
		instance.method();
	}

}
