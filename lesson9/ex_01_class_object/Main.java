package ex_01_class_object;

public class Main {

	public static void main(String[] args) {
		//created an object of Main class. It have all Object class'es methods
		Main main = new Main();
		
		//object of Car class also have all Object class'es methods
		Car car = new Car();
	}

}

//class Car explicitly inherited from class Object
class Car extends Object{
	
}
