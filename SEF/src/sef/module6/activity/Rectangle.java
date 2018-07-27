package sef.module6.activity;

public class Rectangle extends Shape {

    //Attributes
    public double length, breadth;
    public double area;
    public double perimeter;

    //Default constructor.
    public Rectangle(){
        System.out.println("\nDefault Rectangle Constructor");
    };

    //Parameterized  constructor.
    public Rectangle(double length, double breadth){
        System.out.println("\nParameterized Rectangle Constructor");
        this.length = length;
        this.breadth = breadth;
    };

    public double calculateArea(double length, double breadth){
        area = length * breadth;
        return area;
    };

    public double calculatePerimeter(double length, double breadth){
        perimeter = 2 * (length + breadth);
        return perimeter;
    };


    /*
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    */
}
