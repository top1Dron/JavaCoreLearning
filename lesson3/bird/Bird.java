package bird;

public class Bird {
	public void move() {
		System.out.println("Different ways");
	}
	
	//factory
	Bird meth(){
		return new Swallow();
	}
	
	private int someMethod() {
		return 1;
	}

}
