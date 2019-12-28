package nested_classes.ex_03_inner_classes;

class MyClass{
	private int field = 0;
	
	public class Inner{
		MyClass instance = new MyClass();
		
		public void method(int a) {
			instance.field = a;
			System.out.println(instance.field);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		MyClass.Inner instance = new MyClass().new Inner();
		
		instance.method(3);
	}

}
