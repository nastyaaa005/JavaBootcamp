package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void setAndGetFirstName() {
        Person p = new Person();
        p.setFirstName("John");
        assertEquals("John", p.getFirstName());
    }


    @Test
    public void setAndGetSecondName() {

        Person p = new Person();
        p.setSecondName("John");
        assertEquals("John", p.getSecondName());
    }

    @Test
    public void setAndGetAge() {

        Person p = new Person();
        p.setAge(25);
        assertEquals(25, p.getAge());
    }

    @Test
    public void setAgeLessThanZero() {

        Person p = new Person();
        p.setAge(-1);
        assertEquals("Age cannot be less than zero", 0, p.getAge());
    }

    @Test
    public void introduceMyself() {
        Person p = new Person();
        p.setFirstName("John");
        p.setSecondName("Marple");
        p.setAge(25);
        assertEquals("My name is John Marple and I am 25 years old.", p.introduceMyself());

    }

    @Test
    public void testConstructorDefault(){
        Person p = new Person();
        assertEquals("Unknown", p.getFirstName());
        assertEquals("Unknown", p.getSecondName());
        assertEquals(0, p.getAge());
    }

    @Test
    public void testConstructorAllProperties(){
        Person p = new Person("John", "Marple", 25);
        assertEquals("John", p.getFirstName());
        assertEquals("Marple", p.getSecondName());
        assertEquals(25, p.getAge());

    }

    @Test
    public void testException(){
        Person p = new Person();
        try{
            p.setFirstName("John3");
            p.setSecondName("Marple3");
        }catch(Exception e){
            fail();
        }
    }

}