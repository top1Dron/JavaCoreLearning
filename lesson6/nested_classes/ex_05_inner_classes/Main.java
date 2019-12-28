package nested_classes.ex_05_inner_classes;

class MyClass extends BaseClass{
	
	//inheritance from BaseClass not shared to Inner class
	//only MyClass extends BaseClass
	public class Inner{
		public void methodInner() {
			System.out.println("Method from Inner");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		MyClass instance1 = new MyClass();
		instance1.methodBase();
		
		MyClass.Inner instaInner = new MyClass().new Inner();
		instaInner.methodInner();
	}

}
