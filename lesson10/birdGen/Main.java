package birdGen;

public class Main {

	public static void main(String[] args) {
		Strauss[] s = {new Strauss(55), new Strauss(60)};
		Penguin[] p = {new Penguin(15), new Penguin(18), new Penguin(20)};
		Logic<Strauss> l = new Logic<>(s);
		l.display();
		
		Logic<Penguin> l1 = new Logic<>(p);
		l1.display();
		Logic.weightCompare(l, l1);
	}

}

class Bird{
	int weight;
	public Bird(int weight) {
		this.weight = weight;
	}
	
	void move() {
		
	}
}

class Strauss extends Bird{

	public Strauss(int weight) {
		super(weight);
	}
	
	@Override
	void move() {
		System.out.println("Run");
	}
	
}

class Penguin extends Bird{

	public Penguin(int weight) {
		super(weight);
	}
	
	@Override
	void move() {
		System.out.println("Swim");
	}
	
}

class Logic<T extends Bird> {
	T[] array;
	
	public Logic(T[] array) {
		this.array = array;
	}
	
	void display() {
		for(T el : array) {
			el.move();
			System.out.println(el.weight);
		}
	}
	
	int weightController() {
		int sum = 0;
		for(T el : array) {
			sum += el.weight;
		}
		return sum;
	}
	
	static void weightCompare(Logic<?> el1, Logic<?> el2) {
		System.out.println(el1.weightController() - el2.weightController());
	}
}