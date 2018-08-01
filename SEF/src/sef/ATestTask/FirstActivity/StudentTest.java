package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void checkStudentCFirstName(){
        Student student= new Student();
        try {
            student.setFirstName("Test");
        } catch (IllegalArgumentException e) {

        }
        assertEquals("First name not set", "Test", student.getFirstName());
    }
    @Test
    public void checkStudentLastName(){
        Student student= new Student();
        try {
            student.setSecondName("Test");
        }catch (IllegalArgumentException e) {
        }
        assertEquals("Second name not set", "Test", student.getSecondName());
    }
    @Test
    public void checkStudentAge(){
        Student student= new Student();
        student.setAge(15);
        assertEquals("Age not set", 15, student.getAge());
    }
    @Test
    public void checkStudentSchool(){

        Student student= new Student();
        student.setSchoolName("RTU");
        assertEquals("School not set", "RTU", student.getSchoolName());
    }
    @Test
    public void checkIntroduction(){
        Student student= new Student("RTU");
        try {
            student.setFirstName("John");
        }catch (IllegalArgumentException e) {

        }
        try {
            student.setSecondName("Doe");
    }catch (IllegalArgumentException e) {
        }
        student.setAge(14);

        assertEquals("My name is John Doe and i am 14 years old and I study in university RTU",student.introduce());
        //"My name is "+firstName+" "+secondName+" and i am "+age+" years old";
        //return super.introduce() + " and I study in university "+schoolName;
    }
}
