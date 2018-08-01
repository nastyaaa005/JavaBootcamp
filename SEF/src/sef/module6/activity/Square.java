package sef.module6.activity;

public class Square extends Shape {

    double Side=0.0;
    public Square(){};
    public Square(double side){
        Side=side;
    };

    @Override
    public double calculateArea( ) {
        double area= Side*Side;
        return area;
    }

    @Override
    public double calculateParameter() {
        double parameter=(Side*4);
         return parameter;
    }
}
