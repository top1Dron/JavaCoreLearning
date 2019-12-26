package ex_05_inheritance;

public class Main {

	public static void main(String[] args) {
		
		DerivedClass instance = new DerivedClass();
		instance.field1 = 1;
		instance.field2 = 2;
		instance.field3 = 3;
		
		instance.field4 = 4;
		instance.field5 = 5;
		
		//UpCast DerivedClass instance to basic class BaseClass 
		BaseClass newInstance = (BaseClass)instance; 
		
		System.out.println(newInstance.field1);
		System.out.println(newInstance.field2);
		System.out.println(newInstance.field3);
		
		//these fields belongs to DerivedClass
//		System.out.println(newInstance.field4);
//		System.out.println(newInstance.field5);
		
		System.out.println("instance Id: " + instance.hashCode());
		System.out.println("newInstance Id: " + newInstance.hashCode());
	}
}
