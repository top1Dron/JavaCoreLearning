package what_is_null;

import method_calling.Car;

public class MyClass {
	public static void main(String[] args) {
		String st1 = null; //String can be assign as null
		Car car1 = null; //Car object can be assign as null
		
////		int i = null; //can not convert from null to int
//		Integer i2 = null;
//		int i3 = i2;
//		System.out.println(i3); ////NullPointerException (RuntimeException)
		
		String str2 = (String)null; //null can casted to another types
		Car car2 = (Car)null;
		
		System.out.println(null == null);	//true
		System.out.println(car1 == null);	//true
//		System.out.println(str2.equals(null));//NullPointerException
		
//		car1.getMaxSpeed();  //NullPointerException (RuntimeException)
	}
}
