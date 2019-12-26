package ex_04_constructors;

public class DerivedClass extends BaseClass {
	
	public int derivedField;
	
	public DerivedClass(int number1, int number2) {
		
		//super class field
		super(number1);
		
		derivedField = number2;
	}
}
