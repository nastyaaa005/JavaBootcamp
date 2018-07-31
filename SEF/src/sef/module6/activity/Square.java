package sef.module6.activity;

public class Square extends Shape{


    private double side;
    //private String color;

    Square(){
    }

    Square(int side, String col) {
        this.side = side;
        super.setColor(col);
    }
    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    public double CalculateArea() {
        if (side !=0)
            return side*side;
        else
            return 0;
    };
    public double CalculatePerimeter() {
        if (side !=0)
            return side*4;
        else
            return 0;
    };

    public void printAreaAndPerimeter(){
        System.out.println("The area of square is " + this.CalculateArea());
        System.out.println("The perimeter of square is " + this.CalculatePerimeter());
        System.out.println("The color of square is " + this.getColor());
    }
    }
