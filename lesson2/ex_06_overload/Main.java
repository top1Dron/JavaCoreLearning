package ex_06_overload;

public class Main {
	public static void main(String[] args) {
		
		Animal animalDefault = new Animal();
		Animal animalWithOneParameter = new Animal(22);
		Animal animalWithTwoParameters = new Animal(23,61);
		
		System.out.println("Age:" + animalDefault.getAge() + "; Heght: " + 
				animalDefault.getHeight());
		System.out.println("Age:" + animalWithOneParameter.getAge() + "; Heght: " +
				animalWithOneParameter.getHeight());
		System.out.println("Age:" + animalWithTwoParameters.getAge() + "; Heght: " +
				animalWithTwoParameters.getHeight());
	}
}
