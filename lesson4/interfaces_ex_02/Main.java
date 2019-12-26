package interfaces_ex_02;

public class Main {

	public static void main(String[] args) {
		IInterface1 instance1 = new DerivedClass();
		IInterface2 instance2 = new DerivedClass();
		
		instance1.method1();
//		instance1.method2();
		
//		instance2.method1();
		instance2.method2();
	}

}
