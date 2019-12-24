package ex_08_static.stat_example;

public class BankAcc {
	static int b = 30;
	
	public static void main(String[] args) {
		int a = 10;
//		BankAcc ba = new BankAcc();
		
		System.out.println(a);
//		System.out.println(ba.b);
		System.out.println(BankAcc.b);
	}
}
