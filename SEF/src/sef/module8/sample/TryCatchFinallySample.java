package sef.module8.sample;
// Needs to be completed
public class TryCatchFinallySample {

	//The following String variable is declared at class level. It'd automatically be initialized to null.
	static String str;
	
	public static void main(String[] args) {
		//1 - Create an instance of TryCatchFinallySample and call catchMeIfYouCan()

		catchMeIfYouCan(str);
		catchMeIfYouCan("aqwert");


	}
	
	public void catchMeIfYouCan(String s)
	{
		//As long as we try to print it, it'd work and print null.		
		System.out.println(s);
		
		try {
			System.out.println(s.toUpperCase());
		} catch (NullPointerException e) {
			System.out.println("A variable is not initialized");
		}
		
		System.out.println("This is the end") ;
	}
	
}
