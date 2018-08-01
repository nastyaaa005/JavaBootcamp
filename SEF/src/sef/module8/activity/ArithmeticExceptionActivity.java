package sef.module8.activity;
// Needs to be completed

import java.util.concurrent.ExecutionException;

//1 - Type main method and call catchMe with 10 and 0
public class ArithmeticExceptionActivity {
	public static void main(String args[]); {
		ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
		obj.catchMe(10,0);
		obj.catchMe(2,2);
		obj.catchMe(0,2);
		}



void catchMe (int num1, int num2){




{
	//The following code results in an Exception.
	//2 - Identify the exception and write code to handle this exception.
	try {
		int result = num1 / num2;
		System.out.println("The result is :" + result);
	}	catch (ArithmeticException e) {
		System.out.println("The exception is:" + e.getMessage());
	}	catch (ExecutionException e2) {
		System.out.println();
	}
	finally {
		System.out.println("Thank you for using this program.");
	}
	
	//3 - After handling the exception, write a finally block which
	//prints a message "Thank you for using this program."
	
	//4- try to call catchMe with 10 and 2 now and see which messages get printed. 
	
}

} }
