package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();

        ta.catchMe(5,0);
        //TODO handle exception on proper way
        try {
            ta.validateUser("Ivan");
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("EXCEPTION: The user does not exist");
        }
        ta.catchExeption();
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try{
        for (int i = 0; i <= 10; i++) {
            System.out.println(arr[i]);
        }}catch(ArrayIndexOutOfBoundsException e){System.out.println("Something went wrong: "+e.getMessage());}
       finally {
            System.out.println("This should get printed even if there is an exception");
        }
    }

    void validateUser(String name) throws Exception {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};

        //TODO if name in a list -> set flag=1
        boolean flag =false;
        // if at the end flag=0 -> throw the exeption
        for (int i = 0; i < validUsers.length; i++) {
            if (name.toString() == validUsers[i]) {
                flag = true;
                break;
            }
        }
        if (flag == false) {

            throw new Exception("The person is not found");
        }

        else if (flag == true) {
            System.out.println("Welcome!");
        }
    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        }catch(ArithmeticException a){System.out.println("Exception occured, exception "+a.getMessage());}

        finally{System.out.println("Thank you for using this programm");}

    }
}

