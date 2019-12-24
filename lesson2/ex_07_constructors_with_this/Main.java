package ex_07_constructors_with_this;

public class Main {
	public static void main(String[] args) {
		
		Animal animalDefault = new Animal();
		Animal animalWithOneParameter = new Animal(12);
		Animal animalWithTwoParameters = new Animal(14, 50);
		
		System.out.println("Age:" + animalDefault.getAge() + "; Heght: " + 
				animalDefault.getHeight());
		System.out.println("Age:" + animalWithOneParameter.getAge() + "; Heght: " +
				animalWithOneParameter.getHeight());
		System.out.println("Age:" + animalWithTwoParameters.getAge() + "; Heght: " +
				animalWithTwoParameters.getHeight());
	}
}
