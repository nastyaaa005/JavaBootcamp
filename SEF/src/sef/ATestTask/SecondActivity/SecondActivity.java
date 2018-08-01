package sef.ATestTask.SecondActivity;

import java.util.Scanner;

// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();
		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

		int i = 2;
		int x = 3;
		double a = 10.2;
		double w = 2.5;
		int y = -100;
		int o = 66;
		System.out.println("Minus of -100 and 66= " + minus(y, o));
		System.out.println("Sum of 2 and 3= " + sum(i, x));
		System.out.println("Multi of 10.2 and 2.5= " + multi(a, w));
		System.out.println("Devide of -100 and 2= " + devide(y, i));
	}

	//TODO create the Calculator (here or in additional class)
	public static int sum(int i, int y) {
		return i + y;
	}

	public static int minus(int y, int o) {
		return y - o;
	}

	public static double multi(double a, double w) {
		return a * w;
	}

	public static double devide(int y, int i) {
		return (double) y / i;
	}
}







