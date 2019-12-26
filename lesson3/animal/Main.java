package animal;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat(5, "Marsel", 6, "Sphynx");
		Cat secondCat = new Cat(3, "Barsik", 6, "Maine Coon");
		
		System.out.println(cat.getAge() + " " + cat.getName() + " " + 
				cat.getWeight() + " " + cat.getBrade());
		System.out.println(secondCat.getAge() + " " + secondCat.getName() + " " + 
				secondCat.getWeight() + " " + secondCat.getBrade());
	}
}
