package interfaces.ex_08;

interface IInterface{
	void method();
}

class BaseClass{
	public void method(){
		System.out.println("BaseClass.method()");
	}
}

class DerivedClass extends BaseClass implements IInterface{
	
}

public class Main {

	public static void main(String[] args) {
		DerivedClass instance = new DerivedClass();
		instance.method();
		
		IInterface instance1 = instance;
		instance1.method();
	}

}
