package ex_04_arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = {2, 12, 3, 124, 55, 22};
		int[] arr2 = {56, 78, 23};
		
		Arrays.sort(arr1);
		
//		displays the address in memory
//		which array contains in
		System.out.println(arr1);
		
//		displays content in array using toString()
		System.out.println(Arrays.toString(arr1));
		
//		finding element in array
		System.out.println(Arrays.binarySearch(arr1, 12));
		
		//arrays comparison
		System.out.println(Arrays.equals(arr1, arr2));
		
		//filling 12 to every element in arr1
		Arrays.fill(arr1, 12);
		System.out.println(Arrays.toString(arr1));
	}

}
