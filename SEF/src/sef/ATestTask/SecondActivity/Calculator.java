package sef.ATestTask.SecondActivity;


public class Calculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("The result sum x, y, and z is " + calc.add());
    }

    int x = 4;
    int y = 7;
    int z = 1;

    public int add() {
        int sum = x + y + z;
        return sum;
    }
}