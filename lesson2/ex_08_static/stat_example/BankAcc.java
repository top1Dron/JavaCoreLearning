package ex_08_static.stat_example;

public class BankAcc {
	static int b = 30;
	int z = 33;
	
	public static void main(String[] args) {
		int a = 10;
//		BankAcc ba = new BankAcc();
		
		System.out.println(a);
//		System.out.println(ba.b);
		System.out.println(BankAcc.b);
		
//		from static method cannot be called 
//		non-static fields
//		System.out.println(z);
	}
	
	private void view() {
//		System.out.println(a);
		System.out.println(b);
		
//		from non-static method can be called 
//		non-static fields
		System.out.println(z);
	}
}
