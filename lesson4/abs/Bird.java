package abs;

public abstract class Bird implements ICreator{
	
//	public void move() {
//		System.out.println("Different ways");
//	}
	
	@Override
	public void live()
	{
		System.out.println("I can live");
	}
	
	public abstract void move();
	
	public void eat() {
		System.out.println("I can eat");
	}
}
