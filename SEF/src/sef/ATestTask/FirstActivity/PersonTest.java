package sef.ATestTask.FirstActivity;

import static org.junit.Assert.*;

public class PersonTest {
    public void testFirstNameGetAndSet()
    {
        Person jack = new Person;
        jack.setFirstName("Jack");
        String name = jack.getFirstName();
        assertEquals("Jack", name);
    }

    public void testAgeGetAndSet()
    {
        Person jack = new Person;
        jack.setAge(33);
        int age = jack.getAge();
        assertEquals(33, age);
    }

    public void testSecondNameGetAndSet()
    {
        Person jack = new Person;
        jack.setSecondName("Daniels");
        String name = jack.getSecondName();
        assertEquals("Daniels", name);
    }

    public void testPersonConstructorD()
    {
        Person jack = new Person();
        assertEquals("Unknown", jack.getFirstName());
        assertEquals("Unknown", jack.getSecondName());
        assertEquals(0, jack.getAge());
    }

    public void testPersonConstructorP()
    {
        Person jack = new Person("Jack", "Daniels",33);
        assertEquals("Jack", jack.getFirstName());
        assertEquals("Daniels", jack.getSecondName());
        assertEquals(33, jack.getAge());
    }

}