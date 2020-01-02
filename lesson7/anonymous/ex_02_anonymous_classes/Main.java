package anonymous.ex_02_anonymous_classes;

interface Interface{
	void method();
}

public class Main {

	public static void main(String[] args) {
		Interface instance = new Interface() {
			public double d = 1.3;
			protected String str = "Anonymous class";
			private int num = 10;
			
			@Override
			public void method() {
				num = 1234;
				System.out.println("str = " + str + "\ninstance1: d = " + d + ", num = " + num);
			}
		};
		instance.method();
		
//		no access to public double d
//		System.out.println(instance.d);
	}

}
