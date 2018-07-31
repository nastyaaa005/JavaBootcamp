package sef.module6.activity;


import java.sql.SQLOutput;

public class InheritanceOfShapes {

    public static void main(String[] args){

        Rectangle2 rectangle = new Rectangle2(10, 2, "blue");
        Square square = new Square(5, "red");

        rectangle.printAreaAndPerimeter();
        System.out.println("----------------------------------------------------");
        square.printAreaAndPerimeter();
    }
}
