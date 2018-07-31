package sef.module17.activity;

public class Student_I extends Person_I{

    //Attributes
    private int grade;
    private String school;


    //Getters and Setters
    public void setGrade(int grade){
        this.grade= grade;
    }
    public int getGrade(){
        return grade;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
    public  String announce(){
        return super.announce() +
            " \n I'm from school " + school +
            " My grade is " + grade;
    }
}
