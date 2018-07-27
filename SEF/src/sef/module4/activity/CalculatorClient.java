package sef.module4.activity;

import javax.xml.soap.SOAPPart;

/**
 * @author
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
		 *final variable defined in Calculator class. 
		*/
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		System.out.println("*** Calculations will be performed using " + normalCalc.getCalculatorType() + " calculator ***");
		
		// Add 
		int result = normalCalc.add(4, 5);
		System.out.println("Add result: " + result);
		
				
		// Multiply 
		int[] mul = {2, 3, 4};
		result = normalCalc.multiply(mul);
		System.out.println("Mult result: " + result);


		Calculator cacl = new Calculator("New Type");
		//cacl.setCalculatorType("New Type");
		System.out.println("\n*** Calculations will be performed using " + cacl.getCalculatorType() + " calculator ***");

		// Divide
		result = normalCalc.divide(4,2);
		System.out.println("Div result: " + result);

		// Subtract
		System.out.println("Sub result: " + cacl.subtract(15,5));

	}


	

}
