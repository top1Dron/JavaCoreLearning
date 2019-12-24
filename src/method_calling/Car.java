package method_calling;

public class Car {
	
	private String model;
	private int maxSpeed;
	private int year;
	private int speed;
	
	public Car() {
	}
	
	public Car(String model, int maxSpeed, int year, int speed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.year = year;
		this.speed = speed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}
	
}
