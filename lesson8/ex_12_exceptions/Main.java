package ex_12_exceptions;

public class Main {

	public static void main(String[] args) {
		try {
			throw null;
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
