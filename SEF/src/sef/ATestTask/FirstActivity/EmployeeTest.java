package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee(1,"Test Analyst","Accenture",300);
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

}