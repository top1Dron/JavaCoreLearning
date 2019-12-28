package nested_classes.ex_04_inner_classes;

//inheritance from BaseClass not shared to MyClass
//only Inner extends BaseClass
class MyClass{
	public class Inner extends BaseClass{
		public void methodFromInnerClass() {
			System.out.println("Inner.methodFromInnerClass");
		}
		
		//overriding allowed
//		@Override
//		public void methodFromBaseClass() {
//			System.out.println("Override from Inner");
//		}
	}
}

public class Main {

	public static void main(String[] args) {
		MyClass.Inner instance = new MyClass().new Inner();
		
		instance.methodFromBaseClass();
		instance.methodFromInnerClass();
	}

}
