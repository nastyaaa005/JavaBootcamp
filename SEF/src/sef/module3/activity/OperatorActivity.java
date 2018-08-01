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
		float result = i-j;
		// Print result
		System.out.println("Difference: "+i+"-"+j+ " = " + (int)(result));
		// Add numbers
		result= i+j;
		System.out.println("Addition: "+i+"+"+j+ " = " + (int)result);
		result=i*j;
		System.out.println("Multiplication: "+i+"*"+j+ " = " + (int)result);

		result=(float)i/j;
		System.out.println("Division: "+i+"/"+j+ " = " + result);

	}

}
