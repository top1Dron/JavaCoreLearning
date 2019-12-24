package ex_07_constructors_with_this;

public class Animal {
	
	private int age;
	private int height;
	
	public Animal() {
		this(13, 69);
	}
	
	public Animal(int height) {
		this(12, height);
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
