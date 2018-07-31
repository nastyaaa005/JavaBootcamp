package sef.module6.activity;

public class Rectangle2 extends Shape{

    private double sideA;
    private double sideB;
    //private String color;


    public double getSideA() {
        return this.sideA;
    }

    public void setSideA(int side) {
        this.sideA = side;
    }

    public double getSideB() {
        return this.sideB;
    }

    public void setSideB(int side) {
        this.sideB = side;
    }

    Rectangle2(){

    }

    Rectangle2(int sA, int sB, String col){
        this.sideA=sA;
        this.sideB=sB;
        this.color=col;
    }

    public double CalculateArea() {
        if (sideA !=0 & sideB !=0)
            return sideA*sideB;
        else
            return 0;
    };
    public double CalculatePerimeter() {
        return sideA*2 + sideB*2;
    };

    public void printAreaAndPerimeter(){
        System.out.println("The area of rectangle is " + CalculateArea());
        System.out.println("The perimeter of rectangle is " + CalculatePerimeter());
        System.out.println("The color of rectangle is " + getColor());
    }
}
