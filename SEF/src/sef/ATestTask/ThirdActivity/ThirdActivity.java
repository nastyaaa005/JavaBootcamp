package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.catchMe(9, 0);


        try {
            ta.validateUser("Mike");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ta.catchExeption();
    }

    void catchExeption() {
        try {

            int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }

                System.out.println("This should get printed even if there is an exception");

        }catch (ArrayIndexOutOfBoundsException q){
                    }
    }

    void validateUser(String name) throws Exception {
        {
            try {

                String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
                Boolean flag = false;
                for (int i = 0; i < 4; i++) {
                    if (validUsers[i]==name) {
                      flag = true;
                      System.out.println("user is valid");
                    }

                }
                if (flag == false){
                    throw new Exception("user not valid");
                }

            } catch (ArrayIndexOutOfBoundsException e) {

                //TODO if name in a list -> set flag=1
                // if at the end flag=0 -> throw the exeption
            } finally {
                System.out.println("execution completed");
            }
        }
    }


    void catchMe(int num1, int num2) {
        //TODO Catch exeption
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);


        } catch (ArithmeticException e) {
            System.out.println("you shouldnt divide by zero");
        } finally {
            System.out.println("Thank you for using this program.");
        }

        //TODO prints a message "Thank you for using this program." always


    }
}

