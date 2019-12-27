package static_members.ex_04_static_blocks;

public class Main {

	public static void main(String[] args) {
		System.out.println(NotStaticClass.x);
		
		NotStaticClass instance = new NotStaticClass(1111);
		System.out.println(instance.x);
		
		System.out.println(NotStaticClass.x);
	}

}
