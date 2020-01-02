package enums.ex_03_enumerations;

enum Company{
	
	//instances
	DRON(1000), GOOGLE(100), SKYNET(10); //, TEST, TEST2(1000, "string"); //Error
	private int value;
	
	public int getValue() {
		return value;
	}

	//Constructor can be only private
	Company(int value){
		this.value = value;
	}
	
}

public class Main {

	public static void main(String[] args) {
		Company myComp = Company.DRON;
		
		System.out.println("I am working at " + myComp + " company and I am getting " + 
		   myComp.getValue() + "$ per month.");
	}

}
