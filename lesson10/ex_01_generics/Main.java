package ex_01_generics;

class MyClass<T> {
	public T field;
	public void method() {
		System.out.println(field.getClass());
	}
}

public class Main {

	public static void main(String[] args) {
		
//		creating instance of the class MyClass and sending String as type parameter
		MyClass<String> instance1 = new MyClass<>();
		instance1.field = "ABC";
		instance1.method();
		
//		we cannot send simple types like int, double etc as type parameter
//		MyClass<int> instance2 = new MyClass<>();
		
//		creating instance of the class MyClass and sending Integer as type parameter
		MyClass<Integer> instance3 = new MyClass<>();
		instance3.field = 123;
		instance3.method();
	}

}
