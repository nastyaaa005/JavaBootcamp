package sef.ATestTask.SecondActivity;

import java.util.Scanner;

public class Fibonacci {

    static int fib(int n) {
        if (n <= 1) { return n; }
        else return fib(n-1) + fib(n-2);
    }

    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("User's input ");
        int n = reader.nextInt();
        reader.close();

        int i = 0;
        while(i < n) {
            System.out.print(fib(i) + " ");
            i++;
        }
    }
}
