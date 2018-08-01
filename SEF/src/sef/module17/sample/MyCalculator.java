package sef.module17.sample;
// Complete Code
class MyCalculator {
	
	public int getSum(int a, int b) {
		
		return a + b; //covered
	}
	
	public int getDifference(int a, int b){
		return a - b;
	}
	
	public double getProduct(double a, double b){
		return a * b;
	}
	
	public double getQuotient(double a, double b){

		if (b==0){

			throw new IllegalArgumentException("You re not allowed to divide by zero");
		}
		 else {return a / b;}
	}
}
