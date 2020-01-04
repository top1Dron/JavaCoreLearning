package ex_02_class_object_methods;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(160, "blue");
		
		//return object class
		System.out.println(car.getClass());
		
		//car.toString()
		System.out.println(car);
	}

}
