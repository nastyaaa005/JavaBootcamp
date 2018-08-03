package sef.ATestTask.SecondActivity;
import java.util.Scanner;
public class Fibonacci {
    /*Bonus task
    3) Develop println of n Fibonacci_number https://en.wikipedia.org/wiki/Fibonacci_number
    For example if user put 7 -> 0 1 1 2 3 5 8. if user put 10 -> 0 1 1 2 3 5 8 13 21 34

    *Developed with array of integers*/
    public static void main(String args[])
    {
        System.out.println("How many numbers to show?");
        Scanner scanner = new Scanner( System.in );
        int num = scanner.nextInt();
        int Fibonacci[];
        Fibonacci = new int[num];
        for(int i = 0; i < num; i++)
        {
            if(i < 2) Fibonacci[i] = i;
                    else Fibonacci[i] = Fibonacci[i-1]+Fibonacci[i-2];
            System.out.println(Fibonacci[i]);
        }

    }
}
