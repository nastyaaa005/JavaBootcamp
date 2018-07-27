package sef.module3.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 30;
		int j = 15;
		
		// Subtract numbers
		int result1 = i-j;

		// Print result
		System.out.println("Difference = " + result1);
		
		// Add numbers
		int result2 = i+j;
		
		// Print result
		System.out.println("Addition = " + result2);

		// Divide numbers
		int res = i/j;

		//Print result
		System.out.println("Division = " + res);

		//Multiply numbers
		int n = i*j;
		int q = i%j;

		//Print result
		System.out.println("Multiply = " + n);
		System.out.println("Modulo = " + q);

	}

}
