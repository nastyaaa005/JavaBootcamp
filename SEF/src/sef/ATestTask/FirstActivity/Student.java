package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student {
    public String university;

//    public Student() {
//        this.university = "Latvijas Universitate";
//    }

    public Student(String university) {
        this.university = university;
    }

    public String getUniversity() { return university;}

    public void setUniversity(String university) { this.university = university; }

//    public static void main(String[] args) {
//        Student one = new Student();
//        System.out.println("My name is " +  one.firstName + " and I study at " + one.university + ".");
//    }
}
