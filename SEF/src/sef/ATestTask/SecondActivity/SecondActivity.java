package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

		System.out.println(calculator.add(10.2, 5));
		System.out.println(calculator.subtract(10.2, 5));
		System.out.println(calculator.subtract(1.9, 100));
		System.out.println(calculator.multiply(10, 0.5));

		try {
			System.out.println(calculator.divide(10, 5));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(calculator.divide(10.2, 0));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}



	}

	//TODO create the Calculator (here or in additional class)

}
