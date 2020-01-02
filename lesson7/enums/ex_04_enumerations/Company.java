package enums.ex_04_enumerations;

public enum Company {
	DRON(1000){
		//you can override methods for individual instances of enum type
		@Override
		public int getValue() {
			return 10 + this.value;
		}
		
		//abstract methods have to be override in instances of enum type
		@Override
		public String getCurrency() {
			return "dollars";
		}
	}, GOOGLE(100){
		@Override
		public int getValue() {
			return 10 + this.value;
		}
		
		@Override
		public String getCurrency() {
			return "cents";
		}
	}, SKYNET(10){
		@Override
		public String toString() {
			return "Company: " + super.toString();
		}

		@Override
		public String getCurrency() {
			return "euros";
		}
	};
	
	int value;
	String currency;
	
	//you can override methods for each instances of enum type
	@Override
	public String toString() {
		return "Company: " + super.toString() + ", salary = " + getValue() + " " + getCurrency();
	}
	
	public abstract String getCurrency();

	public int getValue() {
		return 10 + this.value;
	}

	Company(int value){
		this.value = value;
	}
}
