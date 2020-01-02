package anonymous.ex_04_anonymous_classes;

interface Interface{
	void method();
}

public class Main {

	public static void main(String[] args) {
		int n = 100;
		
		Interface instance = new Interface() {
			public int field = 11;
			
			@Override
			public void method() {
				field = 1;
				System.out.println("instance: field = "+ field);
			}
		};
		
		instance.method();
	}

}
