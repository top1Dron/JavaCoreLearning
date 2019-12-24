package ex_08_static.methods;

public class Main {

	private int count;
	
	public static void main(String[] args) {
		Main.doSmth(); //using class name

//		without using class name, 
//		cause method in the same class
		doSmth();
		
//		will work only with static field
//		System.out.println(Main.count);
		Main mainObj = new Main();
		System.out.println(mainObj.count);
	}
	
	private static void doSmth() {
		System.out.println("Hello !");
	}
}
