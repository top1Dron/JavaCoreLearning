package ex_06_generics;

/**
 * Bad example. Not recommended to use
 */
class MyClass<T> {
	public T add(T a, T b) {
		if (a.getClass().equals(Integer.class)) {
			return (T) (Object) ((Integer) a + (Integer) b);
		}
		
		if (a.getClass().equals(Double.class)) {
			return (T) (Object) ((Double) a + (Double) b);
		}
		
		return (T) (Object) 0;
	}
}

public class Main {

	public static void main(String[] args) {
		MyClass<Integer> my = new MyClass<>();
		
		int sum = my.add(2, 3);
		
		System.out.println(sum);
		
		MyClass<Double> myD = new MyClass<>();
		
		double multyply = myD.add(2.1, 3.2);
		
		System.out.println(multyply);
	}

}
