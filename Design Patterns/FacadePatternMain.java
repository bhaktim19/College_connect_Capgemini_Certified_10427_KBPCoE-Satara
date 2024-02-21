package com.edu.pattern;

interface Shape2 {
	void draw();
}

class Rectangle2 implements Shape2 {
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}

class Square2 implements Shape2 {

	@Override
	public void draw() {
	    System.out.println("Square::draw()");
	 }
}

class Circle2 implements Shape2 {

	   @Override
	   public void draw() {
	      System.out.println("Circle::draw()");
	 }
}

class ShapeMaker{
	private Shape2 circle;
	private Shape2 rectangle;
	private Shape2 square;
	
	public ShapeMaker() {
		circle = new Circle2();
		rectangle = new Rectangle2();
		square = new Square2();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}

public class FacadePatternMain {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();

	}

}
