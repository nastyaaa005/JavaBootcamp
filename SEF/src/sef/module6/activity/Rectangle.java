package sef.module6.activity;

public class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle() {
        this(2, 3);
    }
    public Rectangle(double w, double h){
        this.w=w;
        this.h=h;
    }

    @Override
    public double area(){
        return w*h;
    }

    @Override
    public double perimeter(){
        return 2*(w+h);
    }
}
