package ex_02_exceptions;

public class Main {

	public static void main(String[] args) {
		Exception ex = new Exception("My exception");
		
		try {
			throw ex;
		} catch (Exception e) {
			System.out.println("Exception handling");
			System.out.println(e.getMessage());
		}
	}
}
