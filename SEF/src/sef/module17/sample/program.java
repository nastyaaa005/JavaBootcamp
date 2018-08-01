package sef.module17.sample;

import sef.module14.sample.Employee;
import sef.module4.sample.Person;

public class program {
    public static void main(String args[]){
        Person_T person1= new Person_T();
        Student_T student1=  new Student_T();
        Employee_T emp_1=new employee_T();

        student1.setGrade.setGrade(2);
        student1.setSchoo("SchoolName");
        student1.setName("John");
        student1.setAge(22);

        System.out.println(student1.announce());

        emp_1.setId("emp123");
        emp_1.setFirstName("shiva");
        emp_1.setLastName("prasad");
        emp_1.setSalary("1233445");

        System.out.println(emp_1.announce());

    }
}
