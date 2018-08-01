package sef.module17.activity;

public class Programm {
    public static void main(String args[])
    {
        Person_T person1=new Person_T();
        Student_T student1= new Student_T();
        Employee_T employee1=new Employee_T();

        student1.setGrade(2);
        student1.setSchool("TestSchool");
        student1.setName("John");
        student1.setAge(15);
        System.out.println(student1.announce()+"\n");


       person1.setAge(33);
       person1.setName("Archer");
       System.out.println(person1.announce()+"\n");


       employee1.setName("Berry");
       employee1.setAge(35);
       employee1.setSalary(3000);
       employee1.setCompany("Borring Company");
       System.out.println(employee1.announce());



    }
}
