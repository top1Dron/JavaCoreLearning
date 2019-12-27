package ex_02_arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		System.out.println(arr1.length);
		
//		array overriding(creating new array)
//		so, we create new object(using "new") and there is not any links on an old one
//		it potentially can be deleted by garbage collector
		
		
		arr1 = new int[25];
		System.out.println(arr1.length);
	}

}
