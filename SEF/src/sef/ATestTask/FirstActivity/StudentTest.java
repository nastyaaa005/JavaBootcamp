package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StudentTest {
    @Test
    public void getAndsetschoolName() {
        Student student = new Student();
        student.setSchool("School");
        assertEquals("School", student.getSchool());
    }
    public void announce() {
        Student student = new Student();
        assertEquals("School", student.announce());
    }
    }
