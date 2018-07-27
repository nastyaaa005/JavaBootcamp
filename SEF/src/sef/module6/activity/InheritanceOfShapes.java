package sef.module6.activity;

import java.util.concurrent.SynchronousQueue;

public class InheritanceOfShapes {

    public static void main(String[] args){

        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(10);
        rectangle.setSideB(2);
        rectangle.setColor("blue");

        Square square = new Square();
        square.setSide(5);
        square.setColor("red");

        rectangle.printAreaAndPerimeter();
        square.printAreaAndPerimeter();
    }
}
