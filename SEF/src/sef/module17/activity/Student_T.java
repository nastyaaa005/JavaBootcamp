package sef.module17.activity;

public class Student_T extends Person_T {

    private int grade;
    private String school;

    public void setGrade(int i) {
        this.grade = i;
    }

    public void setSchool(String schoolName) {
        this.school = schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public String getSchool() {
        return school;
    }
    @Override
    public String announce() {
        return super.announce() + " I'm from " + school + " school. My grade is " + getGrade() + ".";
    }
}
