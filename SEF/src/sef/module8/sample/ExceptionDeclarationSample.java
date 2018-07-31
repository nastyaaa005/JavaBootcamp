package sef.module8.sample;
// Needs to be completed
public class ExceptionDeclarationSample {

	public static void setAge(int age){		
		if(age < 0 ){
			//1 - Throw an instance of  IllegalArgumentException with a String parameter
			//The parameter passed would be printed in the output
		throw new IllegalArgumentException("Age cannot be less than zero.");
		}
	}
	
	public static void main(String arg[]){
		//2 - Call setAge with a negative parameter
		ExceptionDeclarationSample exDecS = new ExceptionDeclarationSample();
		try {
			exDecS.setAge(-1);
		} catch (IllegalArgumentException e) {
			System.out.println("Age cannot be less than zero.");
		}
	}
}
