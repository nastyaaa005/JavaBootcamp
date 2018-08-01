package sef.ATestTask.SecondActivity;

public class Calculator {
    private String calculatorType;
    public static final  String CALC_TYPE_BASIC = "Basic";
    public Calculator(){}

    public Calculator(String calculatorType){
        this.calculatorType = calculatorType;
    }

    public String getCalculatorType(){
        return calculatorType;
    }

    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }
    public  int add(int X,int Y){
        int sum = X+Y;
        return sum;
    }
    public  int substract(int X,int Y){
        int diff = 0;
        if(X > Y){
            diff= X-Y;
        }
        else {
            diff = Y-X;
        }
        return diff;
        }
    public int multiply (int X,int Y) {
        int mul = X * Y;
        return mul;
    }
    public int divide(int X, int Y){
        int divValue=0;
        if (X == 0 || Y== 0 ){
            divValue = 0;
        }
        else{
            divValue = X/Y;
        }
        return divValue;
    }
}
