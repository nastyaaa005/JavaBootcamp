package sef.ATestTask.FirstActivity;

public class ExceptionNameContainsNotLetters extends Exception{

    public ExceptionNameContainsNotLetters(){
        super();
    }

    @Override
    public String toString() {
        return "The name should contain only letters.";
    }


    @Override
    public String getMessage() {

        return toString();
    }
}
