package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person{
    private String university;

//    public Student() {
//        this.university = "Latvijas Universitate";
//    }

    public Student(String firstName, String secondName, int age, String university) {
        super(firstName, secondName, age);
        this.university = university;
    }

    public String getUniversity() { return university;}

    public void setUniversity(String university) { this.university = university; }

//    public static void main(String[] args) {
//        Student one = new Student();
//        System.out.println("My name is " +  one.firstName + " and I study at " + one.university + ".");
//    }
}
