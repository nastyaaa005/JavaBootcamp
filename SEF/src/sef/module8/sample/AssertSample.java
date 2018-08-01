package sef.module8.sample;

import sef.module11.sample.ScannerInputSample;

import java.util.Scanner;

// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static int test(int i, int k)
	{
		//1 - Type assert 5 %2 and 6%2 in separate statements
		return  i/k;

	}
	public static void main(String arg[]){
		Scanner input= new Scanner(System.in);
		System.out.println("enter a number to divide");
		int i = input.nextInt();
		System.out.println("enter a number to divide");
		int k = input.nextInt();

		assert k!=0 :"you are not able to be divdied";
		assert  (i>=0 && k>0);

		//2 - Call test(
		System.out.println("result" + AssertSample.test(i,k));
		
	}			
}
