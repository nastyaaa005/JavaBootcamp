package sef.module17.activity;

public class Student_T extends Person_T {
     private  int grade;
    private String school;

    public void setGarde(int grade) {
        this.grade = grade;
    }
    public int getGrate() {
    return grade;
    }
    public void setSchool(String school) {
        this.school=school;
    }

    public String getSchool() {
        return school;
    }
    public String announce(){
        return super.announce()+
                "\n Iam from School \"" + school +"\"and my grade is" + grade;
}
}
