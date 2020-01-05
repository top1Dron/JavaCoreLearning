package test_eq;

public class Cat {
	String name;
	
	public Cat() {
		
	}
	
	public Cat(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Cat c1 = new Cat("Bars");
		Cat c2 = new Cat("Bars");
		
		if(c1 == c2) {
			System.out.println("Cats equal");
		} else {
			System.out.println("They are not equal");
		}
		
		String a = "Barsik";
		String b = "Barsik";
		
		if(a == b) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
}


class Animal extends Cat {
	static String n;
	String name1;
	
	//may be used
	Animal(String name){
		super(name);
	}
	
	//also may be used
	Animal(){
		super(n);
	}
	
	//cannot be used, only static field can be sended to super class constructor
//	Animal(){
//		super(name1);
//	}
}
