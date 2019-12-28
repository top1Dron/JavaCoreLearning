package nested_classes.ex_02_inner_classes;

class MyClass{
	private static int field = 0;
	
	public class Inner{
		public void method(int number) {
			field = number;
			System.out.println(field);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		MyClass.Inner instance = new MyClass().new Inner();

		instance.method(1);
	}

}
