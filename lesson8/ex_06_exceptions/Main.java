package ex_06_exceptions;

import java.io.FileInputStream;

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
			System.out.println("Exception handling");
			userException.method();
			
			try {
				String fileLoc = "/home/dron/eclipse-workspace/JavaCoreLearning/" +
						"JavaCoreLearning/lesson8/ex_06_exceptions/NonExistentFile.log";
				FileInputStream fs = new FileInputStream(fileLoc);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
