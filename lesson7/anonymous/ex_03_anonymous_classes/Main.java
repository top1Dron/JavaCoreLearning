package anonymous.ex_03_anonymous_classes;

interface Interface{
	void method();
}

public class Main {

	public static void main(String[] args) {
		Interface instance = new Interface() {
			private int publicField;

			@Override
			public void method() {
				publicField = 1234;
				System.out.println("instance1: publicField = " + getPublicField());
			}
			
			public int getPublicField() {
				return publicField;
			}
		};
		
		instance.method();
		
//		no access here
//		System.out.println(instance.getPublicField());
	}

}
