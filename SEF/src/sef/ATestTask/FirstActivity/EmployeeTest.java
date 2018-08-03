package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {


    //TODO 1 try to get 100% of test coverage
    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test");
        assertEquals("I am an error message", "Test", employee.getFirstName());
    }

    // Employee tests

    @Test
    public void testEmpIdGetAndSet()
    {
        Employee maggy = new Employee();
        maggy.setEmpId(14);
        int ID = maggy.getEmpId();
        assertEquals(14, ID);
    }

    @Test
    public void testJobTitleGetAndSet()
    {
        Employee maggy = new Employee();
        maggy.setJobTitle("Tester");
        String JobTitle = maggy.getJobTitle();
        assertEquals("Tester", JobTitle);
    }
    @Test
    public void testCompanyNameGetAndSet()
    {
        Employee maggy = new Employee();
        maggy.setCompanyName("Stark Industries");
        String CompanyName = maggy.getCompanyName();
        assertEquals("Stark Industries", CompanyName);
    }

    @Test
    public void testSalaryGetAndSet()
    {
        Employee maggy = new Employee();
        maggy.setSalary(1335.67);
        double Salary = maggy.getSalary();
        assertEquals(1335.67, Salary,0.001);
    }

    @Test
    public void testEmployeeConstructorD()
    {
        Employee maggy = new Employee();
        assertEquals("Unknown", maggy.getJobTitle());
        assertEquals("Unknown", maggy.getCompanyName());
        assertEquals(0, maggy.getEmpId());
        assertEquals(0.00, maggy.getSalary(),0.001);

    }

    @Test
    public void testEmployeeConstructorPAndAnnounce()
    {
        Employee maggy = new Employee("Stark Industries", 2, "Tester", 1335.67);
        assertEquals("Stark Industries", maggy.getCompanyName());
        assertEquals("Tester", maggy.getJobTitle());
        assertEquals(2, maggy.getEmpId());
        assertEquals(1335.67, maggy.getSalary(),0.001);
        maggy.setFirstName("Maggy");
        maggy.setSecondName("Smith");
        maggy.setAge(23);
        assertEquals("My name is Maggy Smith and i am 23 years old. I am work as Tester in Stark Industries", maggy.announce());

    }

    @Test
    public void testReSet()
    {
        Employee maggy = new Employee("Stark Industries", 2, "Tester", 1335.67);
        assertEquals("Stark Industries", maggy.getCompanyName());
        assertEquals("Tester", maggy.getJobTitle());
        assertEquals(2, maggy.getEmpId());
        assertEquals(1335.67, maggy.getSalary(),0.001);
        maggy.setFirstName("Maggy");
        maggy.setSecondName("Smith");
        maggy.setAge(23);
        assertEquals("My name is Maggy Smith and i am 23 years old. I am work as Tester in Stark Industries", maggy.announce());
        maggy.reSet("Google",6786,"Developer",1765.78);
        assertEquals("My name is Maggy Smith and i am 23 years old. I am work as Developer in Google", maggy.announce());

    }



}