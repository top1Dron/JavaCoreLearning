package enums.ex_04_enumerations;

public class Main {

	public static void main(String[] args) {
		
		//object with a link on an instance of enum type Company
		Company myCom = Company.DRON;
		System.out.println(myCom);
		
		int salary = myCom.getValue();
		String currency = myCom.getCurrency();
		System.out.println("I am getting " + salary + " " + currency + " per month");
	}

}
