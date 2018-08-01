package sef.ATestTask.SecondActivity;

import java.security.PublicKey;

// Complete Code
public class SecondActivity {
    public  int Sum;

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();

        System.out.println("Sum of these numbers: "+calculator.div(10.2,5.0));
        System.out.println("Sum of these numbers: "+ calculator.sum(4,3));
        System.out.println("Sum of these numbers: "+calculator.mul(5,5));

    }
    public double div(double a, double b){
	    return a/b;
    }

    public int sum(int i, int k) {
	    return i+k;
    }
    public int mul(int a,int b){
	    return a*b;
    }


    //TODO create the Calculator (here or in additional class)

}
