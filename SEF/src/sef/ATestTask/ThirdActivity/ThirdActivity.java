package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import java.util.ArrayList;


public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception in a proper way
        try {
            ta.validateUser("Ivan");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            ta.catchExeption();
        }

        ta.catchMe(5, 0);
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This should get printed even if there is an exception");
        }
    }

    void validateUser(String name) throws IllegalAccessException {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;
        //TODO if name in a list -> set flag=1
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < validUsers.length; i++) {
            list.add(validUsers[i]);
        }

        if (list.contains(name)){
            flag = 1;
        } else {
            flag = 0;
        }

        // if at the end flag=0 -> throw the exeption
        if (flag == 0){
            throw new IllegalAccessException("No access for " + name);
        }
    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
        int result= 0;
        try {
            result = num1/num2;
            System.out.println("The result is :" + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
         //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");
        }

    }
}

