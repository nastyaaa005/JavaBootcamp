package sef.module8.sample;

import java.util.Scanner;

// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static int test(int i , int k)
	{
		//1 - Type assert 5 %2 and 6%2 in separate statements
//	assert (5%2==1); // pareizi
//	assert (6%2==1): "Error in operation"; // ja nepareizi un apstādina programmas izpildi

		return i/k;


	}
	public static void main(String arg[]){
		//2 - Call test()
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to divide: ");
		int i=sc.nextInt();
		System.out.println("Enter divisor: ");
		int k=sc.nextInt();
		assert k!=0: "Div by zero";
		assert i>0;

		AssertSample as=new AssertSample();
		int result=as.test(i,k);
		System.out.println("Result: "+ result);
	}			
}
