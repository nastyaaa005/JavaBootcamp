package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

    @Test
    public void checkDefaultEmployee(){
        Employee employee = new Employee();
        assertEquals("Invalid empId", 0, employee.getEmpId());
        assertEquals("Invalid job title", "Unknown", employee.getJobTitle());
        assertEquals("Invalid company name", "Unknown", employee.getCompanyName());
        assertEquals("Invalid salary", 0, employee.getSalary(), 0);
    }
}