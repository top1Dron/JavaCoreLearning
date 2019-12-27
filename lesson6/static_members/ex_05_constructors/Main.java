package static_members.ex_05_constructors;

public class Main {

	public static void main(String[] args) {
		
		//1 option: calling only static constructor 
//		NotStaticClass.staticMethod();
		
		//2 option calling both constructors
		new NotStaticClass().notStaticMethod();
	}

}
