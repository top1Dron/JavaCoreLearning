package ex_08_interface_inheritance;

public class Main {

	public static void main(String[] args) {
		
		SomeClass instance = new SomeClass();
		instance.method();
		System.out.println(instance.publicField);
		
		//UpCast
		SomeInterface instanceUp = instance;
		instanceUp.method();
//		System.out.println(instanceUp.publicField); //Error
		
		//DownCast
		SomeClass instanceDown = (SomeClass)instanceUp;
		instanceDown.method();
		System.out.println(instanceDown.publicField);
	}

}
