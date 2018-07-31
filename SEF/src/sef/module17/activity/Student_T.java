package sef.module17.activity;

public class Student_T extends Person_T {
    private int grade;
    private String school;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String announce() {
        return  super.announce() + ", I am grade " + getGrade() + " student in " + getSchool();
    }
}
