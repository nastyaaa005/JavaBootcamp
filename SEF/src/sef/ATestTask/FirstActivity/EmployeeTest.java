package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

    @Test
    public void testSetId() {
        Employee e1 = new Employee();
        e1.setId(555);
        assertEquals(555, e1.getId());
    }


    @Test
    public void testConstructor() {
        Employee e1 = new Employee(123, "manager", "Philips", 66.99);

        assertEquals(66.99, e1.getSalary(), 0);
        assertEquals("Philips", e1.getCompanyName());
        assertEquals("manager", e1.getJobTitle());


    }

    @Test
    public void testSetsalary() {
        Employee e1 = new Employee();
        e1.setSalary(77.00);
        assertEquals(77.00, e1.getSalary(), 0);
    }

    @Test
    public void testSetCompanyName() {
        Employee e1 = new Employee();
        e1.setCompanyName("Philips");
        assertEquals("Philips", e1.getCompanyName());
    }


    @Test
    public void testSetjobTitle() {
        Employee e1 = new Employee();
        e1.setjobTitle("manager");
        assertEquals("manager", e1.getJobTitle());
    }


    @Test
    public void testannounce() {
        Employee e1 = new Employee(123, "manager", "Philips", 66.99);
        assertEquals("My name is John Brown and my age is 25\n" +
                "I work as manager in company Philips", e1.announce());
    }


}