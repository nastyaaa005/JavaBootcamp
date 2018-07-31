package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
public static void main(String[] args) {
	TryCatchFinallyActivity obj=new TryCatchFinallyActivity();
	System.out.println("Out of upper bound------------");
	obj.catchMeIfYouCan(10);
	System.out.println("Equal to upper bound------------");
	obj.catchMeIfYouCan(9);
}

void catchMeIfYouCan(int upperBound)
{
	try {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		for (int i = 0; i <= upperBound; i++) {
			System.out.println(arr[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("The array is out of bounds!");
	}
	finally {
		System.out.println("This should get printed even if there is an exception");
	}
}

}
