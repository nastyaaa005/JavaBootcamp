package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person{

   // public String firstName;
 //   public String secondName;
    public int schoolName;

//TODO 1 Implement Person Attributes

    //Behavior - default constructor
    public Student() {

    }

    //Behavior - parameterized constructor
    public Student(String firstname, String secondname, int schoolName)
    {
        this.firstName = firstname;
        this.secondName = secondname;
        this.schoolName = schoolName;
    }


    // getter for String firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // getter for int aschoolName
    public int schoolName() {
        return schoolName;
    }

    // setter for int schoolName
    public void setschoolName(int schoolName) {
        this.schoolName = schoolName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void introduce () {
        System.out.println ("I am study in university "+ schoolName );

    }
}







