package ex_02_class_object_methods;

public class Car {

	private int speed;
	private String color;
	
	public Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format("Speed is: %d\nColor is: %s", this.speed, this.color);
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
