/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class VariableAssignmentActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1- Declare a variable of type int and assign it default value.
		int i = 0;
		// 2- Update the value 
		i = i + 20;
		// 3- Print updated value to the console
		System.out.println("My variable is equal to " +i);

		int j =50;
		System.out.println("New variable j is " + j);

		j = i;
		System.out.println("New variable j is " + j);

	}

}
