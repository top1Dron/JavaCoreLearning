package nested_classes.ex_06_inner_classes;

import nested_classes.ex_06_inner_classes.MyClass.Nested;

class MyClass{
	public static class Nested{
		static int number =10;
		
		double b = -30.2;
		
		void say() {
			System.out.println("Hello!");
		}
		
		public static void staticMethodFromNested() {
			System.out.println("Static method from Nested class");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		MyClass.Nested.staticMethodFromNested();
		System.out.println(MyClass.Nested.number);
		
		MyClass.Nested instance = new Nested();
		
		instance.say();
	}

}
