package declaration;

public class Main {
	
	public static void main(String[] args) {
		
		
		//Animal includes constructor with parameters
		//so we can not use default constructor without parameters
		//without explicit declaration
		//Animal cat = new Animal(); 
		Animal cat = new Animal("Marsel", 5);
		Animal cat2 = new Animal("Barsik", 7);
		
		System.out.println(cat.getName() + " " + cat.getAge());
		System.out.println(cat2.getName() + " " + cat2.getAge());
	}
}
