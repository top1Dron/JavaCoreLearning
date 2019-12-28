package nested_classes.ex_01_inner_classes;

class MyClass{ //outer class (top-lvl class)
	public class Inner{
		public void method() {
			System.out.println("Inner class'es method");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		MyClass.Inner instance = new MyClass().new Inner();
		
		instance.method();
	}
}
