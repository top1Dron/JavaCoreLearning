package enums.ex_01_enumerations;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {

	public static void main(String[] args) {
		
		//object with link on instance of Date type 
		Day today = Day.TUESDAY;
		System.out.println("Today is " + today);
		
		int num = 4;
//		You can't give int type value
//		today = number;
//		today = 4;
	}

}
