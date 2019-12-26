package ex_09_interface_inheritance;

public class Main {

	public static void main(String[] args) {
		
		SomeClass instance = new SomeClass();
		instance.method1();
		instance.method2();
		instance.method3();
		
		//UpCast
		SomeInterface1 instanceUp1 = new SomeClass();
		instanceUp1.method1();
//		instanceUp1.method2(); //Error
//		instanceUp1.method3(); //Error
		
		//UpCast
		SomeInterface2 instanceUp2 = new SomeClass();
		instanceUp2.method2();
//		instanceUp2.method1(); //Error
//		instanceUp2.method3(); //Error
		
		//UpCast
		SomeInterface3 instanceUp3 = new SomeClass();
		instanceUp3.method3();
//		instanceUp3.method1(); //Error
//		instanceUp3.method2(); //Error
		
		//DownCast
		SomeClass instanceDown = (SomeClass)instanceUp1;
		instanceDown.method1();
		instanceDown.method2();
		instanceDown.method3();

	}

}
