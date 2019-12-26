package bird;

public class Swallow extends Bird {

	@Override
	public void move() {
		System.out.println("Fly");
	}
	
	public Swallow meth() {
		return new Swallow();
		
	}
}
