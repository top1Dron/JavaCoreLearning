package ex_05_exceptions;

public class Main {

	public static void main(String[] args) {
		try {
			throw new UserException();
		} catch(UserException e) {
			System.out.println("Exception handling");
			e.method();
		}
	}
}
