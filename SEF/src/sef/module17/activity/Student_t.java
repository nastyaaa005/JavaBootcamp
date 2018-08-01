package sef.module17.activity;

public class Student_t extends Person_t{
    private int grade;
    private String school;

    public void setGrade(int i) {
        grade = i;
    }

    public int getGrade() {
        return grade;
    }

    public void setSchool(String schoolName) {
        school = schoolName;
    }

    public String getSchool() {
        return school;
    }

    public void announce(){
        super.announce();
        System.out.println("i am from " + school);
    }


}
