package sef.module8.sample;

import java.util.Scanner;

// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static int test(int i, int k)
	{
		//1 - Type assert 5 %2 and 6%2 in separate statements
//		assert 5%2 == 1;
//		assert 6%2 == 1: "This is incorrect";
		return i/k;
	}

	public static void main(String arg[]){
		//2 - Call test()
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to divide: ");
		int x = input.nextInt();
		System.out.println("Enter a number to divide (should not be 0): ");
		int k = input.nextInt();

		assert k!=0: "You are not able to divide on zero";
		assert (x>=0 && k>0);

		System.out.println("Result: " + AssertSample.test(x,k));
		
	}			
}
