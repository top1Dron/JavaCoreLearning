package access_modifiers;

public class Main {
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		
		System.out.println(shape.i);
		System.out.println(shape.f);
		System.out.println(shape.c);
		System.out.println(shape.b);
		
		shape.square = 24.0;
		System.out.println(shape.square);
		
		shape.setHeight(200);
		shape.getHeight();
		
		shape.viewShape();
		
		shape.setLenght(144);
		shape.getLenght();
		
		System.out.println(shape);
	}
}
