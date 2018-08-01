package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        try {
            ta.validateUser("Ivan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            //TODO handle exception on proper way
            ta.catchMe(2, 0);
            ta.catchMe(2, 2);
            ta.catchExeption();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    void catchExeption() throws Exception{
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (Exception e){
            throw new Exception("Index is out of bound " + e.getMessage());
        }
        finally {
            System.out.println("This should get printed even if there is an exception");
        }

    }

    void validateUser(String name) throws Exception {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;
        //TODO if name in a list -> set flag=1
        // if at the end flag=0 -> throw the exeption
        for (String s : validUsers) {
            if (name.equals(s)){
                flag = 1;
            }
        }
        if (flag == 0)
            throw new Exception("User " + name + " is not valid.");

    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        }
        catch(ArithmeticException e){
            System.out.println("Division error: " + e.getMessage());
        }
        finally {
            //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");
        }

    }
}

