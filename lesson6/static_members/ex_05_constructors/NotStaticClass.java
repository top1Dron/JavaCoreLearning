package static_members.ex_05_constructors;

public class NotStaticClass {

	public NotStaticClass() {
		System.out.println("Constructor.");
	}
	
	//invoked in any case
	//both when accessing static member and
	//when creating instance of the Class
	static {
		System.out.println("Static block.");
	}
	
	//static method
	public static void staticMethod() {
		System.out.println("staticMethod");
	}
	
	//not static method
	public void notStaticMethod() {
		System.out.println("notStaticMethod");
	}
}
