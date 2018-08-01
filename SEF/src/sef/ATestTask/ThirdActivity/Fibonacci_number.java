package sef.ATestTask.ThirdActivity;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci_number {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> fib = fibonacciSeries(n);
        System.out.println(" Sequence is " + fib);
    }

    private static List<Integer> fibonacciSeries(int n) {
        List<Integer> fibo = new ArrayList<Integer>();
        if (n < 0)
            throw new IllegalArgumentException(" n should not be less than zero");
        else if (n == 0)
            return Arrays.asList(0);
        else if (n == 1)
            return Arrays.asList(0, 1);
        else {
            fibo = new ArrayList<Integer>();
            fibo.add(0);
            fibo.add(1);
            for (int i = 2; i < n; i++) {
                int ele1 = fibo.get(i - 1);
                int ele2 = fibo.get(i - 2);
                fibo.add(ele1 + ele2);
            }
        }

        return fibo;
    }
}