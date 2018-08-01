package sef.ATestTask.FirstActivity;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void checkPersonCFirstName() throws IllegalArgumentException {
        Person person = new Person();
        person.setFirstName("Test");
        assertEquals("First name not set", "Test", person.getFirstName());
    }
    @Test
    public void checkPersonLastName(){
        Person person = new Person();
        try {
            person.setSecondName("Test");
        }catch (IllegalArgumentException e) {

        }
        assertEquals("Second name not set", "Test", person.getSecondName());
    }
    @Test
    public void checkPersonAge(){
        Person person = new Person();
        person.setAge(15);
        assertEquals("Age not set", 15, person.getAge());
    }
@Test
    public void checkIntroduction(){
        Person person= new Person();
    try {
        person.setFirstName("John");
    }catch (IllegalArgumentException e) {

    }
    try {
        person.setSecondName("Doe");
    }catch (IllegalArgumentException e) {

    }
    person.setAge(24);

        assertEquals("My name is John Doe and i am 24 years old",person.introduce());

    }
}
