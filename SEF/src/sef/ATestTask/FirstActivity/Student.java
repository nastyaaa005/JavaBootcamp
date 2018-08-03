package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person{

    private String schoolName;
    private String course;

    public Student(){
        this.schoolName="";
        this.course="";

    }
    //I am study in university <schoolName>
    public String anounce()

    {return "I am "+getFirstName()+" study in university "+schoolName+""; }

}
