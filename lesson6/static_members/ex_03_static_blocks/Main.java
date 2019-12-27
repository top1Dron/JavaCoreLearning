package static_members.ex_03_static_blocks;

public class Main {

	public static void main(String[] args) {
		System.out.println(NotStaticClass.X);
		
		NotStaticClass instance = new NotStaticClass();
		System.out.println(instance.X);
	}

}
