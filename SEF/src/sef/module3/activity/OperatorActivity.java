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
		i += 10;

		// Print result
		System.out.println("Multiply i*j = " + i*j);

		// Add numbers
		result = i/j;

		// Print result
		System.out.println("Division i/j = " + result);

		if (i>j)
			System.out.println("i = " +i + "; j = " + j + " i is greater then j");


		result = i%j;
		System.out.println("i = " +i + "; j = " + j +". Modulo i%j = " + result);


		System.out.println("i = " +i + "; j = " + j +". Devision on float i/j = " + i / (float) j);
		System.out.println("i = " +i + "; j = " + j +". Modulo on float i%j = " + i % (float) j);
		
	}

}
