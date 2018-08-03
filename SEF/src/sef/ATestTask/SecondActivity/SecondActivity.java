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

        System.out.println(calculator.getAdd(66,5));
        System.out.println(calculator.getSub(x,y));
        System.out.println(calculator.getMult(x,y));
        System.out.println(calculator.getDiv(x,y));

    }


    public  int getAdd(int x, int y) {
        int result = x + y;
        return result;
    }

    public int getSub(int x, int y) {
        int result = x - y;
        return result;
    }

    public int getMult(int x, int y) {
        int result = x * y;
        return result;
    }

    public double getDiv(double x, double y) {
        double result = x / y;
        return result;
    }

}

//TODO create the Calculator (here or in additional class)


