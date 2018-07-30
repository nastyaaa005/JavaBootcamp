package sef.module8.activity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class CustomExceptionActivityTest {

	//1 - Type main method and call validateUser() from it.
	//Call this method with different names to test it
    public static void main(String[] args) {
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();
        obj.validateUser("Name");
        obj.validateUser("John");
        obj.validateUser("");
        obj.validateUser("Mike1");
        obj.validateUser("Mike");
        obj.validateUser("Shanti");
        obj.validateUser("Stacie");
        obj.validateUser("   ");
    }

    void validateUser(String name) {
        //array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        //flag stores 1 if a match is found else it should remain 0
        boolean flag = false;
        for (int i = 0; i < 4; i++) {
            //2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
            if (name == validUsers[i]) {
                flag = true;
                break;
            }
        }

        //3 - check if flag is zero, throw CustomExceptionActivity Exception.
        //You may also have to declare this exception in the method call using throws.
        try {
            if (flag == false) {
                throw new CustomExceptionActivity();
            }
            else {
                System.out.println(name + ", welcome to Payroll program");
            }
        }

        catch (CustomExceptionActivity e) {
            System.out.println("Ex handled: " + e.getMessage());
        }
        //4 - else if flag is one, print a message "Welcome to Payroll program".

    }
}
