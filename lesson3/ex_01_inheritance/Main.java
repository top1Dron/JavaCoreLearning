package ex_01_inheritance;

public class Main {

	public static void main(String[] args) {
		DerivedClass instance = new DerivedClass();
		
//		System.out.println(instance.privateField); has private access in BaseClass
		System.out.println(instance.protectedField);
		System.out.println(instance.publicField);
	}
}
