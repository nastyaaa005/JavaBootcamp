package sef.module6.activity;

public class Rectangle extends Shape{


    double height;
    double width;

    public Rectangle(){}

    @Override
    public double calculateArea() {
        double area=width*height;
        return area;
    }

    @Override
    public double calculateParameter() {
        double per=(width+height)*2;
        return per;
    }

    public Rectangle(double height,double width)
    {
        this.height=height;
        this.width=width;
    }

}
