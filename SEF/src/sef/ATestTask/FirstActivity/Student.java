package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    private String schoolName;


    public void announce() {
        super.announce();
        System.out.println("I am study in university " + schoolName);
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {

        return schoolName;
    }
}