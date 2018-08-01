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
    public void testEmpId(){
        Employee employee = new Employee();
        employee.setEmpId(66);
        assertEquals("I am an error message", 66, employee.getEmpId());
    }

    @Test
    public void testJobTitle(){
        Employee employee = new Employee();
        employee.setJobTitle("Test3");
        assertEquals("I am an error message", "Test3", employee.getjobTitle());
    }

    @Test
    public void testCompanyName(){
        Employee employee = new Employee();
        employee.setCompanyName("Test4");
        assertEquals("I am an error message", "Test4", employee.getCompanyName());
    }

    @Test
    public void testSalary(){
        Employee employee = new Employee();
        employee.setSalary(555.88);
        assertEquals("I am an error message", 555.88, employee.getSalary(),0);
    }

    @Test
    public void testId(){
        Employee employee = new Employee(1,"Tester","Global", 1800);
        assertEquals("I am an error message", 1, employee.getEmpId());
        assertEquals("Tester", employee.getjobTitle());
        assertEquals("Global", employee.getCompanyName());
        assertEquals(1800.0, employee.getSalary(),0);

    }

}