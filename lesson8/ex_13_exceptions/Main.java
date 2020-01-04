package ex_13_exceptions;

class MyExceptionA extends Exception {
	public MyExceptionA(String message) {
		super(message);
	}
}

class MyExceptionB extends MyExceptionA {

	public MyExceptionB(String message) {
		super(message);
	}
	
}

public class Main {

	public static void main(String[] args) {
		try {
			throw new MyExceptionA("MyExceptionA");
		} catch(MyExceptionB bExc) {
			System.out.println(bExc.getMessage());
		} catch(MyExceptionA aExc) {
			System.out.println(aExc.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
