package sef.module17.activity;

public class Programm {
public static void main(String arg(1){
    Person_T person1 = new Person_T();
    Student_T student1 = new Student_T();
    Employee_T employee1 = new Employee_T();

    student1.setGrade(2);
    student1.setSchool("SchoolName");
    student1.setName("John");
    student1.setAge(22);
    System.out.println(student1.announce());
}
}

