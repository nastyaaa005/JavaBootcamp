package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {


    @Test
        public void testSchoolNameGetAndSet()
        {
            Students jill = new Students();
            jill.setSchoolName("Avery HighSchool");
            String name = jill.getSchoolName();
            assertEquals("Avery HighSchool", name);
        }

    @Test
        public void testStudentsConstructorD()
        {
            Students jill = new Students();
            assertEquals("Unknown", jill.getSchoolName());
        }

    @Test
        public void testStudentsConstructorPAndAnnounce()
        {
            Students jill = new Students("Avery HighSchool");
            assertEquals("Avery HighSchool", jill.getSchoolName());
            assertEquals( "I am study in university Avery HighSchool", jill.announce());
        }
    }

