package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {


	public static void main(String[] args) {

		SecondActivity calc = new SecondActivity();

		System.out.println("The result for sum x and y is " + calc.add(4, 7));
		System.out.println("The result for multiply x and y is " + calc.multiply(4, 7));
		System.out.println("The result for divide x and y is " + calc.divide(4, 7));
		System.out.println("The result for subtract x and y is " + calc.subtract(4, 7));
	}



	public int add(int x, int y) {

		return (x + y);

	}

	public int multiply(int x, int y) {

		return (x * y);
	}

	public float divide(float x, float y) {

		return (y / x);
	}

	public int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x - y;
		} else {
			diff = y - x;
		}

		return diff;
	}

}


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more




	//TODO create the Calculator (here or in additional class)


