package sef.module8.activity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class CustomExceptionActivityTest {

    public static void main (String args[]){
        //1 - Type main method and call validateUser() from it.
        //Call this method with different names to test it
        CustomExceptionActivityTest cat=new CustomExceptionActivityTest();
        try {
            cat.validateUser("Vanda");
        }catch(Exception e){System.out.println("Error happened, error: \n "+e.getMessage());}
        try {
            cat.validateUser("John");

        }catch(Exception e){System.out.println("Error happened, error: \n "+e.getMessage());}
    }



void validateUser(String name) throws CustomExceptionActivity
{
	//array of names
String []validUsers={"John","Mike","Shanti","Stacie"};
//flag stores 1 if a match is found else it should remain 0

        boolean flag = false;
        for (int i = 0; i < validUsers.length; i++) {
            if (name.toString() == validUsers[i]) {
                flag = true;
                break;
            }
//2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
        }

//3 - check if flag is zero, throw CustomExceptionActivity Exception.
        if (flag == false) {

            throw new CustomExceptionActivity();
        }
//You may also have to declare this exception in the method call using throws.

        else if (flag == true) {
            System.out.println("Welcome to Payroll program");
        }

//4 - else if flag is one, print a message "Welcome to Payroll program". 

}
}
