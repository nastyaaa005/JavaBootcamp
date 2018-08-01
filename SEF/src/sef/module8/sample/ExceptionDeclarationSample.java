package sef.module8.sample;
// Needs to be completed
public class ExceptionDeclarationSample {

	public static void setAge(int age){		
		if(age < 0 ){
			//1 - Throw an instance of  IllegalArgumentException with a String parameter
			//The parameter passed would be printed in the output
			throw new IllegalArgumentException("age cannot be less than zero");
		}
	}
	
	public static void main(String arg[]){
		//2 - Call setAge with a negative parameter
		try {
			ExceptionDeclarationSample.setAge(12);
			ExceptionDeclarationSample.setAge(-2);
			ExceptionDeclarationSample.setAge(0);
		}catch (Exception e){
			System.out.println("declaration exception");
		}
		finally {
			{
				System.out.println("final block");
			}
		}
		
	}
}
