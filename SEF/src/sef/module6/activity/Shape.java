package sef.module6.activity;

public abstract Shape {

	public String color;
	
	public Shape() {
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
    abstract public double calculateAres();
	abstract public double calculatePrimeter();
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	

}
