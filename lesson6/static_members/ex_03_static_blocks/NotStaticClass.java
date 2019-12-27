package static_members.ex_03_static_blocks;

public class NotStaticClass {
	public static final int X;
	
	//static block
	static {
		X =10;
		System.out.println("Static block X = " + X);
	}
	
	public NotStaticClass() {
//		X = 4; //Error, static block calls earlier, when constructor
		System.out.println("Constructor X = " + X);
	}
}
