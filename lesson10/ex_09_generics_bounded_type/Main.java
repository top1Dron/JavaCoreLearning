package ex_09_generics_bounded_type;

interface Interface1{
	/* ... */
}

interface Interface2<U> extends Interface1 {
	
}

class Derived1 implements Interface1, Interface2<Object>{
	
}

class Derived2 implements Interface2<Object>{
	
}

class MyClass1<T extends Interface1> {
	
}

class MyClass2<T extends Interface2<Object>> {
	
}

public class Main {

	public static void main(String[] args) {
		MyClass1<Interface2<Object>> my1 = new MyClass1<>();
		MyClass2<Derived1> my2 = new MyClass2<>();
		MyClass2<Derived2> my3 = new MyClass2<>();
		MyClass2<Interface2<Object>> my4 = new MyClass2<>();
	}

}
