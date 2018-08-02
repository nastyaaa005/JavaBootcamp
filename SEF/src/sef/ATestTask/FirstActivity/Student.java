package sef.ATestTask.FirstActivity;

//TODO Implement class Student

public class Student extends Person{
    private String university;

    public Student(String firstName, String secondName, int age, String university) {
        super(firstName, secondName, age);
        this.university = university;
    }

    public String getUniversity() { return university;}

    public void setUniversity(String university) { this.university = university; }
}