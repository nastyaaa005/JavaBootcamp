package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void checkPersonCreatedProperly(){
       Person person = new Person("first", "second",  4);
        person.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", person.getFirstName());
    }
}
