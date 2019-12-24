package ex_06_overload;

public class Animal {

	private int age;
	private int height;
	
	public Animal() {
		this.age = 14;
		this.height = 60;
	}
	
	public Animal(int age) {
		this.age = age;
		this.height = 66;
	}
	
	public Animal(int age, int height) {
		this.age = age;
		this.height = height;
	}
	
	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
