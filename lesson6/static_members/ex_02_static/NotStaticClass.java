package static_members.ex_02_static;

public class NotStaticClass {
	private int id;
	
	public NotStaticClass(int id) {
		this.id = id;
	}
	
	public static void method() {
//		System.out.println("Instance(0).id = {0}", Id);
		
		System.out.println("Can't invoke non-static field");
	}
}
