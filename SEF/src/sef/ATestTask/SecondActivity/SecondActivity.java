package sef.ATestTask.SecondActivity;
// Complete Code
import java.util.Scanner;
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();

		System.out.println("*************Main Task*****************");

		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more
		System.out.println("Addition: ");
		System.out.println(calculator.sum(5, 2));
		System.out.println("Multiplication: ");
		System.out.println(calculator.mul(5, 6));
		System.out.println("Division: ");
		System.out.println(calculator.divide(0, 5));
		System.out.println("Subtraction: ");
		System.out.println(calculator.sub(5, 8));

		System.out.println("*************Bonus Task*****************");
		//6)BONUS level
		calculator.userCalculator();


	}

	//TODO create the Calculator (here or in additional class)


	public int sum(int a, int b) {
		return a + b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a/b;
	}


	public int sub(int a, int b) {
		return a - b;
	}

	public void userCalculator() {
		System.out.println("Insert two numbers a and b:");
		Scanner scan = new Scanner(System.in);
		SecondActivity calculator = new SecondActivity();
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("What do you need? Add(1), Subtract(2), Multiply(3), Divide(4)");
		int choice = scan.nextInt();
		switch (choice) {
			case 1:
				System.out.println(a + "+" + b + " = " + calculator.sum(a, b));
				break;
			case 2:
				System.out.println(a + "-" + b + " = " + calculator.sub(a, b));
				break;
			case 3:
				System.out.println(a + "*" + b + " = " + calculator.mul(a, b));
				break;
			case 4:
				System.out.println(a + "/" + b + " = " + calculator.divide(a, b));
				break;
			default:
				System.out.println("Misunderstood. Try again.");
				break;

		}

	}
}
