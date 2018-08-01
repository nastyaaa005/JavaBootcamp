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
		int i = 15;
		int j = 4;
		
		// Subtract numbers
		int result = i-j;
		
		// Print result
		System.out.println("difference is: " + result);

		
		// Add numbers
		
		result = i+j;
		// Print result
		System.out.println("sum is: " + result);

		result=i/j;
		System.out.println("divide is: " + result);

		result=i*j;
		System.out.println("mul is: " + result);

		result=i%j;
		System.out.println("mod is: " + result);


	}

}
