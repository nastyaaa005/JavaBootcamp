package sef.ATestTask.SecondActivity;
// Complete Code
import  java.util.Scanner;
public class SecondActivity {

	SecondActivity calculator = new SecondActivity();


	//TODO Use the calculator to calculate different values
	//Example ->
	//calculator.sum(10.2, 5);
	//calculator.divide(100, 33);
	// and more
public static void main(String[] args){
	Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
	Scanner reader = new Scanner(System.in);
	int num1 = reader.nextInt();
	int num2 = reader.nextInt();
	System.out.println("*** Calculations will be performed using " +normalCalc.getCalculatorType()+"calculator ***");

	double result = normalCalc.add(num1,num2);
	System.out.println("1) Add result is " + result);

	double div = normalCalc.divide(num1,num2);
	System.out.println("1) divide result is " + div);

	double mul = normalCalc.multiply(num1,num2);
	System.out.println("1) multiply result is " + mul);

	double sub = normalCalc.substract(num1,num2);
	System.out.println("1) sub result is " + sub);
}
}
	//TODO create the Calculator (here or in additional class)