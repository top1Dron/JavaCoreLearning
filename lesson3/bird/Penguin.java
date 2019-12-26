package bird;

public class Penguin extends Bird {

	@Override
	public void move() {
		System.out.println("Swim and walk");
	}
	
//	not allowed to override private method
//	@Override
//	public int someMethod() {
//		return 1;
//	}
}
