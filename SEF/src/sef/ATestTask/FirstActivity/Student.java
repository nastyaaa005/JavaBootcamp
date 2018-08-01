package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends FirstActivity{

    private int grade;
    public String School;
    public String name;
    private int age;



    public void setGrade(int grade) {
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getSchool() {
        return School;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String announce(){
        return "\nI study in \""+School+"\n and my grade is"+grade;
    }
}

