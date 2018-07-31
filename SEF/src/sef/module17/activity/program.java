package sef.module17.activity;



public class program {

    public static void main (String args[]){

        Person_I person1 = new Person_I();
        Student_I student1 = new Student_I();
        Employee emp1 = new Employee();

        student1.setGrade(2);
        student1.setSchool(" Oxford ");
        student1.setName( " Greeshma Amidyala");
        student1.setAge(21);

        System.out.println(student1.announce());

        emp1.setId("ABC123");
        emp1.setFirstName("Abc ");
        emp1.setLastName(" ASD ");
        emp1.setSalary(12908);

        System.out.println(emp1.announce());



    }
}
