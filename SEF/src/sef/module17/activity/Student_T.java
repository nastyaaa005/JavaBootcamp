package sef.module17.activity;

public class Student_T extends Person_T {
    private int Grade;
    private String School;

    public void setGrade(int i) {
        this.Grade=i;
    }

    public void setSchool(String testSchool) {
        this.School=testSchool;
    }

    public String getSchool() {
        return School;
    }

    public int getGrade() {
        return Grade;
    }

    public String announce(){
    String s=super.announce();
        return s+" \nI am fron school "+School+" and my grade is "+Grade;
    }
}
