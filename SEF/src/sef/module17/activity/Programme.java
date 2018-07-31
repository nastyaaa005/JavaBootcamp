package sef.module17.activity;

public class Programme {

    public static void main (String[] args){

        Person_T person_t = new Person_T();
        Student_T student_t = new Student_T();
        Employee_T employee_t = new Employee_T();

        student_t.setGrade(10);
        student_t.setSchool("Oxford");
        student_t.setName("Mary");
        student_t.setAge(27);

        System.out.println(student_t.announce());

        employee_t.setName("Ivan");
        employee_t.setAge(40);
        employee_t.setSalary(10000);

        System.out.println(employee_t.announce());

        person_t.setAge(12);
        person_t.setName("Zhanna");

        System.out.println(person_t.announce());

    }

}
