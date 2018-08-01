package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //TODO 1 try to get 100% of test coverage
    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

    // Employee tests


    public void testEmpIdGetAndSet()
    {
        Employee maggy = new Employee();
        maggy.setEmpId(13);
        int ID = maggy.getEmpId();
        assertEquals(13, ID)
    }

    public void testJobTitleGetAndSet()
    {
        Employee maggy = new Employee();
        maggy.setJobTitle("Tester");
        String JobTitle = maggy.getJobTitle();
        assertEquals("Tester", JobTitle)
    }

    public void testCompanyNameGetAndSet()
    {
        Employee maggy = new Employee();
        maggy.setCompanyName("Stark Industries");
        String CompanyName = maggy.getCompanyName();
        assertEquals("Stark Industries", CompanyName)
    }

    public void testSalaryGetAndSet()
    {
        Employee maggy = new Employee();
        maggy.setSalary(1335.67);
        double Salary = maggy.getSalary();
        assertEquals(1335.67, Salary,0.001);
    }

    public void testEmployeeConstructorD()
    {
        Employee maggy = new Employee();
        assertEquals("Unknown", maggy.getJobTitle());
        assertEquals("Unknown", maggy.getCompanyName());
        assertEquals(0, maggy.getEmpId());
        assertEquals(0.00, maggy.getSalary(),0.001);

    }

    public void testEmployeeConstructorP()
    {
        Employee maggy = new Employee("Stark Industries", 2, "Tester", 1335.67);
        assertEquals("Stark Industries", maggy.getJobTitle());
        assertEquals("Tester", maggy.getCompanyName());
        assertEquals(2, maggy.getEmpId());
        assertEquals(1335.67, maggy.getSalary(),0.001);

    }


}