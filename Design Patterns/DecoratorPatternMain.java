package com.edu.pattern;

interface Shape1{
	void draw();
}

class Rectangle1 implements Shape1{

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");		
	}
}

class Square1 implements Shape1{

	@Override
	public void draw() {
		System.out.println("Shape: Square");
	}
}

class Circle1 implements Shape1{

	@Override
	public void draw() {
		System.out.println("Shape: Circle");		
	}
}

//Create abstract decorator class implementing the Shape interface.
abstract class ShapeDecorator implements Shape1{
	protected Shape1 decoratedShape;
	
	public ShapeDecorator(Shape1 decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}
}

//Create concrete decorator class extending the ShapeDecorator class.
//Use the RedShapeDecorator to decorate Shape objects.
class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape1 decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape1 decoratedShape) {
		System.out.println("Border color: Red");
	}
	
	
}

public class DecoratorPatternMain {

	public static void main(String[] args) {
		 Shape1 circle = new Circle1();

	     Shape1 redCircle = new RedShapeDecorator(new Circle1());

	     Shape1 redRectangle = new RedShapeDecorator(new Rectangle1());
	     System.out.println("Circle with normal border");
	     circle.draw();

	     System.out.println("\nCircle of red border");
	     redCircle.draw();

	     System.out.println("\nRectangle of red border");
	     redRectangle.draw();

	}

}
