package ex_08_exceptions;

class UserException extends Exception {
	public void method() {
		System.out.println("My exception!");
	}
}

public class Main {

	public static void main(String[] args) {
		try {
			throw new UserException();
		} catch (UserException userException) {
			System.out.println("Exception handling 1");
			userException.method();
			
			try {
				throw userException;
			} catch (UserException exception) {
				System.out.println("Exception handling 2");
				exception.method();
			}
		} finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Code end");
		
	}

}
