package static_members.ex_02_static;

public class Main {

	public static void main(String[] args) {
		NotStaticClass instance = new NotStaticClass(1);
		NotStaticClass.method();
		
	}

}
