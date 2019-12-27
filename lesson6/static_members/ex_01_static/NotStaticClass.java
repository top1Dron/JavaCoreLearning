package static_members.ex_01_static;

public class NotStaticClass {
	private int Id;
	public static int field;
	
	public NotStaticClass(int Id) {
		this.Id = Id;
	}
	
	public void method() {
		System.out.println("Instance(0).field = " + this.Id + ", " + field);
	}
}
