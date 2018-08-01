package sef.ATestTask.SecondActivity;

public class Calculator {

    public Calculator() {


    }


    public double sum(double v, double i) {
        return v + i;
    }

    public int sum(int v, int i) {
        return v + i;
    }

    public long sum(long v, long i) {
        return v + i;
    }

    public float sum(float v, float i) {
        return v + i;
    }

    public double divide(double v, double i) {

        double result = 0;
        if (v != 0) {
            try {
                result = v / i;
            } catch (ArithmeticException e) {
                System.out.println("Division on zero is not allowed. " + e.getMessage());
            }
        }

        return result;
    }

    public float divide(float v, float i) {
            float result = 0f;
            if (v != 0f) {
                try {
                    result = v / i;
                } catch (ArithmeticException e) {
                    System.out.println("Division on zero is not allowed. " + e.getMessage());
                }
            }
            return result;
    }

    public int divide(int v, int i) {

        int result = 0;
        if (v != 0) {
            try {
                result = v / i;
            } catch (ArithmeticException e) {
                System.out.println("Division on zero is not allowed. " + e.getMessage());
            }
        }

        return result;
    }

    public double multiply(double v, double i) {

        if (v !=0 && i != 0){
            return v*i;
        }
        else
            return 0;
    }

    public int multiply(int v, int i) {

        if (v !=0 && i != 0){
            return v*i;
        }
        else
            return 0;
    }

    public float multiply(float v, float i) {

        if (v !=0f && i != 0f){
            return v*i;
        }
        else
            return 0f;
    }

    public double subtract(double v, double i) {
        return v - i;
    }

    public int subtract(int v, int i) {
        return v - i;
    }

    public float subtract(float v, float i) {
        return v - i;
    }

    public double degree(double i, double m) {
        return Math.pow(i, m);
    }
}
