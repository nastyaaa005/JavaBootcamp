package sef.ATestTask.FirstActivity;

import sef.ATestTask.FirstActivity.Person;

public class Student extends Person {

    private int age;
    private int grade;
    private String schoolName;


    //TODO 1 create different constructors
    public Student() {
    }

    public Student (int age, int grade, String schoolName) {
        this.age = age;
        this.grade = grade;
        this.schoolName = schoolName;

    }

    //TODO 2 add getters and setters
    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade (int grade) {
        this.grade = grade;
    }
    public void setSchoolNamee(String schoolName) {
        this.schoolName = schoolName;
    }
    public String getSchoolName(){
        return schoolName;
    }


    public String announce() {
       return super.announce()+" I study in university " + schoolName + " and my avergae grade is " + grade;
    }
}
