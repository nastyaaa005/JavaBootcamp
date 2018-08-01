package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		//System.out.println(calculator.sum(10.2, 5));
		//System.out.println(calculator.divide(100, 33));
		// and more


	}
	public double sum(double a, double b) {

		return a + b;
	}

	public double substract(double a, double b){
		return (double)a - b;
	}

	public double multiple(double a, double b){
		return (double)a * b;
	}

	public double divide(double a, double b){

		if (b==0){

			throw new IllegalArgumentException("You re not allowed to divide by zero");
		}
		else {return(double) a / b;}
	}
	//TODO create the Calculator (here or in additional class)

}
