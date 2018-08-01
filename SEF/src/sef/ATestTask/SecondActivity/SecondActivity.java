package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

    public static void main(String[] args) {
        SecondActivity calculator = new SecondActivity();


        //TODO Use the calculator to calculate different values
        //Example ->
        //calculator.sum(10.2, 5);
        //calculator.divide(100, 33);
        // and more

        int x = 66;
        int y = 5;

        System.out.println( calculator.add(66,8));
        System.out.println(calculator.sub(x,y));



    }


    public  int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public int div(int x, int y) {
        int result = x / y;
        return result;
    }

}

//TODO create the Calculator (here or in additional class)


