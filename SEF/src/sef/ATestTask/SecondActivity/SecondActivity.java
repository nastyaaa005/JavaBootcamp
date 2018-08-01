package sef.ATestTask.SecondActivity;

import java.util.*;

// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		//TODO create the Calculator (here or in additional class)
		Calculator calculator = new Calculator();

		//TODO Use the calculator to calculate different values
		System.out.println("Sum 10.2 + 5: " + calculator.sum(10.2, 5));
		System.out.println("Sum 10 + 5: " + calculator.sum(10, 5));
		System.out.println("Division 10.2 on 5: " + calculator.divide(10.2, 5));
		System.out.println("Division 10 on 5: " + calculator.divide(10, 5));
		System.out.println("Multiplication 10.2 x 5: " + calculator.multiply(10.2, 5));
		System.out.println("Multiplication 10 x 5: " + calculator.multiply(10, 5));
		System.out.println("Subtraction 10.2 - 5: " + calculator.subtract(10.2, 5));
		System.out.println("Subtraction 5 - 10: " + calculator.subtract(5, 10));
		System.out.println("Degree 5 in 2: " + calculator.degree(5, 2));

	}

}
