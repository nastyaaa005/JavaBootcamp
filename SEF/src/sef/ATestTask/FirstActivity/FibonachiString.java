package sef.ATestTask.FirstActivity;

import java.util.Scanner;

public class FibonachiString {


    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers should get calculated");
        int numbersInRow = sc.nextInt();
        FibonachiString fs = new FibonachiString();
        fs.calculateFibonachi(numbersInRow);
        boolean calculate=true;
        while (calculate) {
        System.out.println("Calculaye more numbers Y/N");
        char c = sc.next(".").charAt(0);

            switch (c) {
                case 'y':
                    System.out.println("Enter how many numbers should get calculated");
                    numbersInRow = sc.nextInt();
                    fs.calculateFibonachi(numbersInRow);
                    break;
                case 'n':
                    System.out.println("Goodbye ");
                    calculate=false;
                    break;

                default: {
                    System.out.println("Goodbye ");

                    calculate=false;
                }
            }
        }
    }

    public void calculateFibonachi(int i){


        int [] array= new int[i];

        array[0]=0;
        array[1]=1;
        System.out.print(array[0]+" "+ array[1]+ " " );
        for(int x=2;x<array.length;x++)
        {
            array[x]=array[x-1]+array[x-2];
            System.out.print(array[x]+" ");
        }

    }
}
