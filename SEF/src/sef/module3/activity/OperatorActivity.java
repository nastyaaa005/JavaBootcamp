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
		
		// Print result
		System.out.println("Difference = " + result);
		
		// Add numbers
		i = i*3;
		j = j/2;
		int modulo = i%j;
		
		// Print result
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("Modulo = " + modulo);
		
	}

}
