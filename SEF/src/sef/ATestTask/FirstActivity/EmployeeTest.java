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
    public void checkEmployeeSecondName() {
        Employee employee = new Employee();
        employee.setSecondName("Test1");
        assertEquals("I am an error message", "Test1", employee.getSecondName());
    }

    @Test
    public void checkEmployeeAge() {
        Employee employee = new Employee();
        employee.setAge(0);
        assertEquals("I am an error message", 0, employee.getAge());
    }

    @Test
    public void checkEmployeeId() {
        Employee employee = new Employee();
        assertEquals("I am an error message = 0", 0, employee.getEmpId());
        employee.setEmpId(-1);
        assertEquals("I am an error message >= 0", -1, employee.getEmpId());
        employee.setEmpId(1);
        assertEquals("I am an error message >= 0", 1, employee.getEmpId());
    }

    @Test
    public void checkEmployeeJobTitle() {
        Employee employee = new Employee();
        employee.setJobTitle("Test1");
        assertEquals("I am an error message", "Test1", employee.getJobTitle());
    }

    @Test
    public void checkEmployeeCompanyName() {
        Employee employee = new Employee();
        employee.setCompanyName("Test1");
        assertEquals("I am an error message", "Test1", employee.getCompanyName());
    }

    @Test
    public void checkEmployeeSalary() {
        Employee employee = new Employee();
        employee.setSalary(0.0);
        assertEquals("I am an error message (>= 0)", 0, employee.getSalary(),0);
    }

    @Test
    public void checkEmployeeSalaryNegative() {
        Employee employee = new Employee();
        employee.setSalary(-1.0);
        assertEquals("I am an error message (>= 0)", -1.0, employee.getSalary(),0);
    }

    @Test
    public void checkEmployeeSalaryPositive() {
        Employee employee = new Employee();
        employee.setSalary(1.0);
        assertEquals("I am an error message (>= 0)", 1.0, employee.getSalary(),0);
    }
}