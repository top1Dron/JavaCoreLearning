package package1;

import package2.*;

public class Main extends Parent {
	public static void main(String[] args) {
		ExampleInPackage1 ex1 = new ExampleInPackage1();
//		System.out.println(ex1.name1); //private
		System.out.println(ex1.name2); //package
		System.out.println(ex1.name3); //protected
		System.out.println(ex1.name4); //public
		
		ExampleInPackage2 ex2 = new ExampleInPackage2();
//		System.out.println(ex2.name1); //private
//		System.out.println(ex2.name2); //package
//		System.out.println(ex2.name3); //protected
		System.out.println(ex2.name4); //public
		
		Main main = new Main();
//		System.out.println(main.name1); //private
//		System.out.println(main.name2); //package
		System.out.println(main.name3); //protected
		System.out.println(main.name4); //public
	}
}
