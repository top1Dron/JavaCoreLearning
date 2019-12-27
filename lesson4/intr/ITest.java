package intr;

public interface ITest extends I1, I2{
	
//	public static final - default words for interface's fields
//	public static final int PRICE = 10; //can be simplify
	int PRICE = 10;
	
//	public abstract - default words for interface's methods
//	public abstract void move(); // can be simplify
	void move();
	
	static int sum() {
		return 10*5;
	}
	
	default int multiply() {
		return 10*5;
	}
}

@FunctionalInterface
interface I1{
	void eat();
}

interface I2{
}
