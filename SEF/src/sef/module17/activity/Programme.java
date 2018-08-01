package sef.module17.activity;

public class Programme {
    public static void main(String args[]) {
        Person_t person1 = new Person_t();
        Student_t student1 = new Student_t();
        Employee_t empl1 = new Employee_t();

        student1.setGrade(2);
        student1.setSchool("Oxford");
        student1.setName("John");
        student1.setAge(22);

        student1.announce();

        System.out.println(student1.getGrade());

    }

}
