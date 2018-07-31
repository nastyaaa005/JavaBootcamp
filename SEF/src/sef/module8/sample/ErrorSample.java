package sef.module8.sample;
// Needs to be completed
public class ErrorSample {
	
	//This is an example of an error which cannot be handled programmatically 
	public static void main(String arg[]){

		try {
			infinity();
		} catch (StackOverflowError stackOverflowError) {
			stackOverflowError.printStackTrace();
		}
	}
	
	//Below method calls itself and
	//it happens infinite times because there is no exit condition
	//At one point in time, JVM would give up and show StackOverflowError
	public static void infinity() throws StackOverflowError{
		//1 - Print a message


			System.out.println("Infinity");
			//2 - Call infinity()
		try {
			infinity();
		} catch (StackOverflowError stackOverflowError) {
			stackOverflowError.printStackTrace();
		}

	}
}
