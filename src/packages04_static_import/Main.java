package packages04_static_import;

import static java.lang.Math.PI;
import static java.lang.Math.cos;

public class Main {
	public static void main(String[] args) {
		//using static import
		//may not to call Math class to use PI and cos
		
		double number = 1;
		double result = cos(PI * number);
		System.out.println(result);
	}
}
