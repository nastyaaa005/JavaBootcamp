package sef.module6.activity;

public abstract class Shape {

	private String color;

	public static void main(String[] color) {
		
	}

	public Shape() {

		Shape Square = new Square();
		Square.setColor(red);

	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
	abstract public double calculateArea();
	abstract public double calculatePerimeter();
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	System.out.println("This square is " + Square.setColor(String c));

}
