package ex_04_constructors;

public class BaseClass {

	public int baseNumber;
	
	//have to be defined, cause it will be called
	//when will executed constructor
	//of inheritance class
	public BaseClass() {
	}
	
	public BaseClass(int baseNumber) {
		this.baseNumber = baseNumber;
	}
}
