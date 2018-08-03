package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void checkStudentCreatedProperly(){
        Student student = new Student("first", "second",  24, "university");
        student.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", student.getFirstName());
    }
}
