package sef.module17.activity;

public class Program {
    public static void main(String args[]) {
        Person_T person1 = new Person_T();
        Student_T student1 = new Student_T();
        Employee_T empl1 = new Employee_T();

        student1.setGrade(2);
        student1.setSchool("School-123");
        student1.setName("John");
        student1.setAge(22);

        System.out.println(student1.announce());

        empl1.setName("Alex");
        empl1.setAge(30);
        empl1.setSalary(7000);
        empl1.setTitle("Developer");

        System.out.println(empl1.announce());


    }
}
