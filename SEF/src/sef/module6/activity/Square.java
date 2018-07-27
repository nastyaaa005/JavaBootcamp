package sef.module6.activity;

public class Square extends Shape {

    //Attributes
    public double side;
    public double area;
    public double perimeter;

    //Default constructor.
    public Square(){
        System.out.println("\nDefault Square Constructor");
    };

    //Parameterized  constructor.
    public Square(double side){
        System.out.println("\nParameterized Square Constructor");
        this.side = side;
    };

    public double calculateArea(double side){
        area = side * side;
        return area;
    };

    public double calculatePerimeter(double side){
        perimeter = side * 4;
        return perimeter;
    };


    /*
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
*/
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }

}
