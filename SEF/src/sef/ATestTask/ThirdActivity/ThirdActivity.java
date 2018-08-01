package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) throws Exception {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way

        ta.catchExeption();
        ta.catchMe(1,0);

        ta.validateUser("Ivan");
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("This should get printed even if there is an exception");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }

    void validateUser(String name) throws Exception {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        for (int i = 0; i < validUsers.length; i++) {
            if (validUsers[i].equals(name)) {
                System.out.println("User is valid");
            }
            else{
                System.out.println("Invalid");
            }
            //TODO if name in a list -> set flag=1
            // if at the end flag=0 -> throw the exeption
            if (flag == false) {
                throw new Exception("User is not valid");
            }
        }
    }

    void catchMe(int num1, int num2)
    {
        num1=10;
        num2= 4;
        //TODO Catch exeption
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        }catch (Exception e){
            System.out.println(" Cannot divide by zero " + e);
        }

        //TODO prints a message "Thank you for using this program." always
        System.out.println("Thank you for using this program.");

    }
}