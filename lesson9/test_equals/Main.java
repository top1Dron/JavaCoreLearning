package test_equals;

public class Main {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2);
		
		str1 += "1";
		str2 += "1";
		System.out.println(str1 == str2);
	}

}
