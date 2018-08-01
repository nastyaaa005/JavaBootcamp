package sef.module17.activity;

public class student_T extends person_T {

    public int grade;
    private String school;
    public void setSchool() {
        this.school=school;
    }

    public void setGrade(int grade) {
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool(){
        return school;
    }
    public String announce(){
        return super.announce()+"\nI am from school\""+school+"\n and my grade is"+grade;
    }

}
