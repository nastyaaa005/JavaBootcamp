/**
 * 
 */
package sef.module3.activity;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Date;

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
		i = 50;
		// 3- Print updated value to the console
		System.out.println(i);

		long j=0;
		System.out.println(j);
		j=i;
		j = 1232763;
		System.out.println(j);




	}

}
