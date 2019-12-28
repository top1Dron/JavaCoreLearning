package static_members.ex_07_static;

abstract class BaseClass {
	
//	public abstract static void abstractMethod(); //Error
	
	public static void staticMethod() {
		System.out.println("BaseClass.staticMethod");
	}
}

class DerivedClass extends BaseClass {
	public static void staticMethod() {
		System.out.println("DerivedClass.staticMethod");
	}
}

public class Main {

	public static void main(String[] args) {
		BaseClass.staticMethod();
		DerivedClass.staticMethod();
	}

}
