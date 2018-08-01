package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student {
    public int studentId;
    public String name;
    public int age;
    public String uni;

    //Behaviour- default constructor
    public Student(){
        this.studentId = 10002;
        this.name = "John";
        this.age = 21;
        this.uni = "Riga Technical University" ;
    }

    //Behaviour- parameterized constructor
    public Student(int studentId, String name, int age,String uni){
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.uni = uni;

    }

    //getter and setter for studentId

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    //getter and setter for name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter and setter for age

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        this.age = age;
    }

    //getter and setter for University name

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }
}
