package sef.ATestTask.SecondActivity;
//couldnt make it in "SecondActivity", Sorry :(
//but atleast I made it partly :D

import java.util.Scanner;

public class InputCalculatorSecondActivity {
    public static class Inputs {
    public static void main(String[] agrs) {
        System.out.println("Hello, welcome to calculator");
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter one number:");
        int input = in.nextInt();
        System.out.println("Please, enter second number:");
        int input2 = in.nextInt();

        System.out.println("You entered " + input + " and " + input2);


        System.out.println("Choose option for yor numbers: Addition(+), Subtrsction(-), Multiplication(*), Devide(/)" +
                "\nEnter three first letters of opt");

        Scanner in2 = new Scanner(System.in);
        while (true){
            String s1;
            s1 = in2.nextLine();


            if (s1.equals("Add")) {
                System.out.println("You choosed Addition");
                System.out.println("Result of " + input + " and " + input2 + " = " + (input + input2));
                break;}
            else
            if (s1.equals("Sub")) {
                System.out.println("You choosed Subc");
                System.out.println("Result of " + input + " and " + input2 + " = " + (input - input2));
                break;}
            else
            if (s1.equals("Mul")) {
                System.out.println("You choosed Multiplication");
                System.out.println("Result of " + input + " and " + input2 + " = " + (input * input2));
                break;}
            else
            if (s1.equals("Dev")) {
                System.out.println("You choosed Devide");
                System.out.println("Result of " + input + " and " + input2 + " = " + (input / input2));

                break;}
            else
                System.out.println("Enter one of the proposed options");
        }
    }
}
}

