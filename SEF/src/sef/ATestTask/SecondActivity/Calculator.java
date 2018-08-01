package sef.ATestTask.SecondActivity;

public class Calculator {

    // Add
    public double add(double x, double y) {
        return x + y;
    }

    // Subtract
    public double subtract(double base, double takeAway) {
        return base - takeAway;
    }

    // Multiply
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divide
    public double divide(double numerator, double denominator) throws ArithmeticException {
        if (denominator == 0){
            throw new ArithmeticException("No dividing by 0");
        }
        return numerator/denominator;
    }
}