package ex_08_static.stat_example;

public class Account {
	
	private double uah;
	private String name;
	private static double courseUSDtoUAH;
	
	public static void main(String[] args) {
		Account.courseUSDtoUAH =26.1;
		Account a1 = new Account();
		a1.name = "Robert";
		a1.uah = 2000.05;
//		a1.courseUSDtoUAH = 26.1;
		
		Account a2 = new Account();
		a2.name = "Edward";
		a2.uah = 1800.6;
//		a2.courseUSDtoUAH = 26.1;
	}

}
