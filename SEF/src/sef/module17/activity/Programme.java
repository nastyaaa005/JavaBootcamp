package sef.module17.activity;

public class Programme {
    public static void main (String[] agrs){
        Person_T person_1= new Person_T();
        Student_T student1=new Student_T();
        Employe_T emp1= new Employe_T();
        student1.setGarde(2);
        student1.setSchool("School name");
        student1.setName("John");
        student1.setAge(22);
        System.out.println(student1.announce());

        emp1.setName("Nathan");
        emp1.setAge(33);
        emp1.setSalary(10000000);
        System.out.println(emp1.announce());

    }
}
