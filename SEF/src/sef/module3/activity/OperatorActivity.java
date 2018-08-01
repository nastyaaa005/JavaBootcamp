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
		int i = 8;
		int j = 5;
		
		// Subtract numbers
		int result = i-j;

		// Add numbers
		int result2 = i + j;
		int result3 = i * j;
		int result4 = i / j;
		
		// Print result
		System.out.println("Difference = " + result);
		System.out.println("Addition = " + result2);
		System.out.println("Multiplication = " + result3);
		System.out.println("Division = " + result4);
	}

}
