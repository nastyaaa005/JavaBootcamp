package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student {
    public int studentId;
    public String name;
    public double age;


    public Student(){
        this.studentId=0001;
        this.name="shiva";
        this.age=22;

    }
    public Student(int studentId, String name, double age){
        this.studentId=studentId;
        this.name=name;
        this.age=age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = 0001;
    }
    public String getName(){
        return name;
    }

    public double getAge() {
        return age;
    }
}
