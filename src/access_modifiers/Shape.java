package access_modifiers;

public class Shape {
	private int lenght;
	private long height;
	public double square;
	
	public int i;
	public float f;
	public char c;
	public boolean b;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}
	
	public void viewShape() {
		System.out.println("Height = " + this.height);
		System.out.println("Lenght = " + this.lenght);
	}
}
