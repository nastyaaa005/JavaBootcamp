package sef.ATestTask.FirstActivity;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        try {
            employee.setFirstName("Test");
        }catch (IllegalArgumentException e) {

        }
        assertEquals("First name not set", "Test", employee.getFirstName());
    }
    @Test
    public void checkEmployeSecondName(){
        Employee employee = new Employee();
        try {
            employee.setSecondName("Test");
        }catch (IllegalArgumentException e) {

        }
        assertEquals("Last name not set", "Test", employee.getSecondName());
    }
    @Test
    public void checkEmployeID(){
        Employee employee = new Employee();
        employee.setEmpId(5);
        assertEquals("Id not set", 5, employee.getEmpId());
    }
    @Test
      public void checkEmployeAge(){
        Employee employee = new Employee();
        employee.setAge(30);
        assertEquals("Age not set", 30, employee.getAge());
    }

    @Test
    public void checkEmployeCompany(){
        Employee employee = new Employee();
        employee.setCompanyName("Company");
        assertEquals("Company not set","Company", employee.getCompanyName());
    }
    @Test
    public void checkEmployetitle(){
        Employee employee = new Employee();
        employee.setJobTitle("Title");
        assertEquals("Title not set","Title", employee.getJobTitle());
    }
    @Test
    public void checkEmployesalary(){
        Employee employee = new Employee();
        employee.setSalary(5000);
        assertEquals("Salary not set",5000, employee.getSalary(),0);
    }
    @Test
    public void checkIntroduction(){
        Employee employee = new Employee("John","Doe",14,1,"Bookkeeper","Riga",4000);
        assertEquals("My name is John Doe and i am 14 years old I am work as Bookkeeper in Riga",employee.introduce());

        //return super.introduce() + "I am work as "+jobTitle+" in "+companyName+"\"\n";
}}