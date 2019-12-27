package ex_06_array_list;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("name");
		arrayList.add("surname");
		
		//setting arrayList's min capacity
		arrayList.ensureCapacity(30);
		
		//arayList's size now
		System.out.println(arrayList.size());
		
		//getting element by its index in arrayList
		System.out.println(arrayList.get(1));
		
		//IndexOutOfBoundsException
		System.out.println(arrayList.get(2));
		
		//getting index of an object in arrayList
		System.out.println(arrayList.indexOf("name"));
		
		//getting index of an object in arrayList from the end
		System.out.println(arrayList.lastIndexOf("surname"));
	}

}
