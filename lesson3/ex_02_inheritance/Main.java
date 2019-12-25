package ex_02_inheritance;

public class Main {

	public static void main(String[] args) {
		
		DerivedClass instance = new DerivedClass();
		
		System.out.println(instance.publicField);
		instance.show();
	}
}
