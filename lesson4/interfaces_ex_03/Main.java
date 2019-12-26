package interfaces_ex_03;

public class Main {

	public static void main(String[] args) {
		DerivedClass instance = new DerivedClass();
		instance.method();
		instance.method1();
		instance.method2();
		
		System.out.println("-----------");
		
		BaseClass instanceBase = instance; //(BaseClass) instance;
		instanceBase.method(); //only method() available from BaseClass
		
		IInterface1 instance1 = instance; //(IInterface1) instance;
		instance1.method1();
		
		IInterface2 instance2 = instance; //(IInterface2) instance;
		instance2.method2();
		
//		IInterface1 instanceLambda = () -> System.out.println("method1() method's realization "
//				+ "from IInterface1 using lambda expression");
//		instanceLambda.method1();

	}

}
