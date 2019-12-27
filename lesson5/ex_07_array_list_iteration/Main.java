package ex_07_array_list_iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
//		ArrayList<Integer> arrList = new ArrayList<>();
//		
////		increased ArrayList capacity, using formula: capacity = capacity * 3 / 2 + 1 
//		for(int i = 0; i < 15; i++) {
//			arrList.add(i);
//		}
//		for(Integer temp : arrList) {
//			System.out.println(temp);
//		}
//		
//		int[] arr = new int[10];
//		//ArrayIndexOutOfBoundsException
//		for(int i = 0; i < 15; i++) {
//			arr[i] = i+1;
//		}
//		for(int temp : arr) {
//			System.out.println(temp);
//		}
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		arrList.add(3);
		arrList.add(5);
		arrList.add(7);
		
		//using iterator we can go through the list
		Iterator<Integer> iterator = arrList.iterator();
		
		//while arrList has next element
		while(iterator.hasNext()) {
			
			//setting next element to integer and displaying it
			Integer integer = iterator.next();
			System.out.println(integer);
		}
		
		//same action, but using iterator, which is optimized to lists
		ListIterator<Integer> listIterator = arrList.listIterator();
		
		while(listIterator.hasNext()) {
			
			//setting next element to integer and displaying it
			Integer integer = listIterator.next();
			System.out.println(integer);
		}
	}

}
