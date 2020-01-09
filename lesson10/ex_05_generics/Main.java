package ex_05_generics;

abstract class Shape{
	
}

class Circle extends Shape{
	
}

interface IContainer<T>{
	T getFigure();
	void setFigure(T figure);
}

class Container<T> implements IContainer<T>{

	private T figure;
	
	public Container(T figure) {
		this.figure = figure;
	}
	
	@Override
	public T getFigure() {
		return this.figure;
	}

	@Override
	public void setFigure(T figure) {
		this.figure = figure;
	}
	
}

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		IContainer<Shape> container = new Container<>(circle);
		
		System.out.println(container.getFigure().toString());
	}

}
