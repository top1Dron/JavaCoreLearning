package ex_04_exceptions;

class MyClass {
	public void myMethod() throws Exception{
		Exception ex = new Exception("My exception");
		throw ex;
	}
}

public class Main {

	public static void main(String[] args) {
		try {
			MyClass instance = new MyClass();
			instance.myMethod();
		} catch(Exception e){
			System.out.println("Message: " + e.getMessage());
			System.out.println("Stack trace: ");
			e.printStackTrace();
		}
	}

}
