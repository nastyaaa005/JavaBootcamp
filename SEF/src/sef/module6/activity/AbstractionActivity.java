package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {


        Square s = new Square(5);
        s.setColor("Red");
        //s.setSide(5);

        System.out.println("--- Square ---");
        System.out.println("Color: " + s.getColor());
        System.out.println("Area: " + s.getArea());
        //System.out.println("Perimeter: " + s.calculatePerimeter());


        //Rectangle r = new Rectangle();
        //r.setColor("");
        //r.setLength(5);
        //r.setBreadth(6);

        //System.out.println("--- Rectangle ---");
        //System.out.println("Color: " + r.getColor());
        //System.out.println("Area: " + r.getArea());
        //System.out.println("Perimeter: " + r.getPerimeter());

    }

}
