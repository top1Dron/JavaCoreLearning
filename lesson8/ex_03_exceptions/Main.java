package ex_03_exceptions;

public class Main {

	public static void main(String[] args) {
		try {
			throw new Exception("My exception");
		} catch (Exception e) {
			System.out.println("Exception handling");
			System.out.println(e.getMessage());
		}
	}

}
