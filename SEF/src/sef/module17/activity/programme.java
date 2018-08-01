package sef.module17.activity;

public class programme {
    public static void main (String args[])
    {
        person_T person1= new person_T();
        student_T student1= new student_T();
        employee_T employee1=new employee_T();

        student1.setGrade(2);
        student1.setSchool("Schoolabc");
        student1.setName("jhon");
        student1.setAge(22);
        employee1.setCompname();


        person1.setName("Sam");

        System.out.println(person1.announce());
        System.out.println(student1.announce());
    }
}
