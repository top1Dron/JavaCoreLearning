package ex_03_constructors;

public class DerivedClass extends BaseClass {
	
	public int derivedField;
	
	public DerivedClass(int number1, int number2) {
		
		//super class field
		baseNumber = number1;
		
		derivedField = number2;
	}
}
