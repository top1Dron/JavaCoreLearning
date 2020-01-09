package withoutGen;

public class Main {

	public static void main(String[] args) {
		WithGen w1 = new WithGen("Test");
		WithGen w2 = new WithGen(10);
		WithGen w3 = new WithGen(new Cat("Marsel"));
		
		w1 = w2;
		
		//ClassCastExeption
		//String s = (String)w1.getObj();
		
		w1.display();
		w2.display();
		w3.display();
	}

}

class WithGen {
	Object obj;
	
	public WithGen(Object obj) {
		this.obj = obj;
	}
	
	void display() {
		System.out.println(obj);
	}
	
	Object getObj() {
		return this.obj;
	}
}

class Cat{
	String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
