package abs;

public class Main {

	public static void main(String[] args) {
		
//		Bird bird = new Bird(); //Bird is abstract; cannot be instantiated
		
		Bird penguin = new Penguin();
		Bird strauss = new Strauss();
		Bird swallow = new Swallow();
		
		penguin.move();
		strauss.move();
		swallow.move();

	}

}
