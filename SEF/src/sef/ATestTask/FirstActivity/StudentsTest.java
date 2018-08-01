package sef.ATestTask.FirstActivity;

import static org.junit.Assert.*;

public class StudentsTest {


        public void testSchoolNameGetAndSet()
        {
            Person jill = new Person;
            jill.setSchoolName("Avery HighSchool");
            String name = jill.getSchoolName();
            assertEquals("Avery HighSchool", name);
        }

        public void testStudentsConstructorD()
        {
            Students jill = new Students();
            assertEquals("Unknown", jill.getSchoolName());
        }

        public void testStudentsConstructorD()
        {
            Students jill = new Students("Avery HighSchool");
            assertEquals("Avery HighSchool", jill.getSchoolName());
        }
    }
}


}