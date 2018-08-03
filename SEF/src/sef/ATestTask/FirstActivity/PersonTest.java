package sef.ATestTask.FirstActivity;

import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testFirstNameGetAndSet()
    {

        Person jack = new Person();
        jack.setFirstName("Jack");
        assertEquals("Jack", jack.getFirstName());

    }
    @Test
    public void testFirstAndSecondNameWithNumbers()
    {
        Person jack = new Person();
        try {
            jack.setFirstName("Jack3");
        }catch(InputMismatchException e) {
            System.out.println(e);
        }
        try{
            jack.setSecondName("Daniel4s");
        }catch(InputMismatchException e){
            System.out.println(e);
        }
    }

    @Test
    public void testAgeGetAndSet()
    {
        Person jack = new Person();
        jack.setAge(33);
        int age = jack.getAge();
        assertEquals(33, age);
    }

    @Test
    public void testSecondNameGetAndSet()
    {
        Person jack = new Person();
        jack.setSecondName("Daniels");
        String name = jack.getSecondName();
        assertEquals("Daniels", name);
    }

    @Test
    public void testPersonConstructorD()
    {
        Person jack = new Person();
        assertEquals("Unknown", jack.getFirstName());
        assertEquals("Unknown", jack.getSecondName());
        assertEquals(0, jack.getAge());
    }

    @Test
    public void testPersonConstructorPAndAnnounce()
    {
        Person jack = new Person("Jack", "Daniels",33);
        assertEquals("Jack", jack.getFirstName());
        assertEquals("Daniels", jack.getSecondName());
        assertEquals(33, jack.getAge());
        assertEquals("My name is Jack Daniels and i am 33 years old. ", jack.announce());
    }


}