package ex_08_static.stat_example;

public class Car {
	
	private String model;
	private String color;
	private static double count;
	
	public static void main(String[] args) {
//		Car c1 = new Car();
//		c1.count = 1;
		Car.count = 1;
		
//		Car c2 = new Car();
//		c2.count = 2;
		Car.count = 2;
		
//		Car c100 = new Car();
//		c100.count = 100;
		Car.count = 100;
	}
}
