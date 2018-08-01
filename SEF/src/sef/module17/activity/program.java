package sef.module17.activity;



public class program {
    public static void main(String args[]){
        Person_T person1= new Person_T();
        student_T student1=  new student_T();
        Employee emp_1=new Employee();

        student1.setGrade(2);
        student1.setSchool("SchoolName");
        student1.setName("John");
        student1.setAge(22);

        System.out.println(student1.announce());

        emp_1.setId("emp123");
        emp_1.setFirstName("shiva");
        emp_1.setLastName("prasad");
        emp_1.setSalary(1233445);

        System.out.println(emp_1.announce());

    }
}
