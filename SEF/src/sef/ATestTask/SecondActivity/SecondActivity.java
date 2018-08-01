package sef.ATestTask.SecondActivity;
// Complete Code

import java.util.Scanner;

public class SecondActivity {

	//TODO Use the calculator to calculate different values
	//Example ->
	//calculator.sum(10.2, 5);
	//calculator.divide(100, 33);
	// and more
	public static void main(String[] args) {
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		Scanner reader = new Scanner(System.in);
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");
		// Add
		double result = normalCalc.add(num1,num2);
		System.out.println("1) Add result is " + result);
		// Division
		double div = normalCalc.divide(num1,num2);
		System.out.println("2) Divide result is " + div);
		//Multiply
		double mul = normalCalc.multiply(num1,num2);
		System.out.println("3) Multiply result is " + mul);
		//Substract
		double sub = normalCalc.subtract(num1,num2);
		System.out.println("4)Substract result is " + sub);


	}
}
	//TODO create the Calculator (here or in additional class)

