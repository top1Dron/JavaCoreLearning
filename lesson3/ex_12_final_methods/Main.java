package ex_12_final_methods;

public class Main {

	public static void main(String[] args) {
		ClassA instanceA = new ClassA();
		instanceA.method1();
		instanceA.method2();
		
		System.out.println("-----------------");
		
		ClassB instanceB = new ClassB();
		instanceB.method1();
		instanceB.method2();

		System.out.println("-----------------");
		
		ClassC instanceC = new ClassC();
		instanceC.method1();
		instanceC.method2();
	}

}
