package ex_07_generics_bounded_type;

/**
 * bounded type
 *
 */
class Base{
	
}

class Derived extends Base{
	
}

/**
 * T extends Base - type argument have to be Base or extend Base class
 */
class MyClass<T extends Base> {
}

public class Main {

	public static void main(String[] args) {
		MyClass<Base> mc1 = new MyClass<>();
		
		MyClass<Derived> mc2 = new MyClass<>();
		
//		String is not extend Base
//		MyClass<String> mc3 = new MyClass<>();
	}

}
