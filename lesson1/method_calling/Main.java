package method_calling;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("BMW", 200, 10, 100);
		Car car2 = new Car();
		
		System.out.println(car1.getModel() + " " + car1.getMaxSpeed());
		
		//showing 2 different objects in heap
		System.out.println(car1);
		System.out.println(car2);
		
		//calling getter and setter of maxSpeed field from Car class using car1 object
		car1.setMaxSpeed(140);
		
		int maxSpeed = car1.getMaxSpeed();
		System.out.println(maxSpeed);
		
		//calling getter and setter of maxSpeed field from Car class using car2 object
		car2.setMaxSpeed(150);
		System.out.println(car2.getMaxSpeed());
	}
}
