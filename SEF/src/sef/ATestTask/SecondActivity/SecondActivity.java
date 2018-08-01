package sef.ATestTask.SecondActivity;

import java.util.Scanner;

// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		Scanner reader = new Scanner(System.in);
		double number1 = reader.nextDouble();
		double number2 = reader.nextDouble();
		reader.close();

		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

        System.out.println("The result for sum is " + calculator.sum(number1, number2));
		System.out.println("The result for division is " + calculator.division(number1,number2));
		System.out.println("The result multiplication is " + calculator.multiplication(number1, number2));
		System.out.println("The result difference is " + calculator.difference(number1, number2));

	}

	//TODO create the Calculator (here or in additional class)

}
