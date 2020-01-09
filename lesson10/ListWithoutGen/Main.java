package ListWithoutGen;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		List<String> l2 = new ArrayList<>();
		
		l1= l2;
		l1.add("Hello");
		
		String s = l2.get(0);
		System.out.println(s);
		
		
	}

}
