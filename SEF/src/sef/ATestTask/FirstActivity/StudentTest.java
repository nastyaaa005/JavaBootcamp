package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {


    @Test
    public void testConstructor() {
        Student e1 = new Student(20, 8, "lu");

        assertEquals(20, e1.getage(), 0);
        assertEquals("lu", e1.getSchoolName());
        assertEquals(8, e1.getGrade());
    }
}





