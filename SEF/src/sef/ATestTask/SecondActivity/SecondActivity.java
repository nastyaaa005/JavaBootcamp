package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->

		System.out.println("sum =" + calculator.sum(10, 5));
		System.out.println("div =" + calculator.div(10, 5));
		System.out.println("mult =" + calculator.mult(10, 5));
		System.out.println("dif =" + calculator.dif(10, 5));
		//calculator.divide(100, 33);
		// and more

	}



	public int sum(int v, int i) {
		return v+i;

	}

	public double div (int v, int i) {
		return (double) v / i;

	}

	public int mult (int v, int i) {
		return v * i;

	}

	public int dif (int v, int i) {
		return v - i;

	}
	//TODO create the Calculator (here or in additional class)

}
