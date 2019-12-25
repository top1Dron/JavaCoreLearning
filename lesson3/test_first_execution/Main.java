package test_first_execution;

public class Main {
	
	public Main() {
		System.out.println("Main");
	}
	
	public static void main(String[] args) {
		Cc c = new Cc();
	}
}

class Aa extends Main{
	public Aa() {
		System.out.println("Aa");
	}
}

class Bb extends Aa{
	public Bb() {
		System.out.println("Bb");
	}
}

class Cc extends Bb{
	public Cc() {
		System.out.println("Cc");
	}
}
