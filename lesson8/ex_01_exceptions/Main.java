package ex_01_exceptions;

public class Main {

	public static void main(String[] args) {
		int a = 1, n = 2;
		
		try {
			//try to divide by zero
			a /= (2-n);
			System.out.println("a = " + a);
		} catch (ArithmeticException e) {
			System.out.println("Exception handling");
			System.out.println(e.getMessage());
		}
	}

}
