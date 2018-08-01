package sef.module8.activity;
// Needs to be completed
public class ArithmeticExceptionActivity {

	public static void main(String args[]){
		ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
	obj.catchMe(12,0);
	obj.catchMe(4324556,264);
	obj.catchMe(0,10);
	}


	void catchMe(int num1, int num2) {
		try {
			int result = num1 / num2;
			System.out.println("The result is :" + result);

		}
		catch (ArithmeticException e)
		{
			System.out.println("you shouldnt divide by zero");

	}
	finally {
			System.out.println("thanks for using the program");
		}
}

	//3 - After handling the exception, write a finally block which
	//prints a message "Thank you for using this program."

	//4- try to call catchMe with 10 and 2 now and see which messages get printed.

}
