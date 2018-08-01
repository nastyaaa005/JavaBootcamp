package sef.module6.activity;

public class ShapesAbstractionClient {



   public static void main(String args[]) {
       Square sq=new Square(5);
        double squarearea = sq.calculateArea();
        double sqparametere = sq.calculateParameter();
        sq.setColor("Blue");
        System.out.println("Area of square= " + squarearea + "\nperimeter of square= " + sqparametere +"\nColour is "+sq.getColor());

        Rectangle rec= new Rectangle(5,6);
        double recarea=rec.calculateArea();
        double recperimeter=rec.calculateParameter();
        rec.setColor("Green");
       System.out.println("Area of rectangle= " + recarea + "\nperimeter of rectangle= " + recperimeter +"\nColour is "+rec.getColor());
    }
}
