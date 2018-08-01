package sef.module17.activity;



public class student_T extends Person_T {

    private int grade;
    private String school;

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public String getSchool(String school){
        return school;
    }
    public String announce(){
        return super.announce() +
                "\n i am from school" + school +
                "My grade is" + grade;
    }
}
