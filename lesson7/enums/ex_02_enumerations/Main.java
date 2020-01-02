package enums.ex_02_enumerations;

enum Day{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {

	public static void main(String[] args) {
		Day today = Day.FRIDAY;
		switch(today) {
			case MONDAY:
				System.out.println("First day of the week: Monday");
				break;
			case SUNDAY:{
				System.out.println("Last day of the week: Sunday");
				break;
			}
			default: System.out.println("This day is "+ today);
		}
		
		if(today == Day.MONDAY) {
			System.out.println("THe week begins.");
		}
		
	}
}
