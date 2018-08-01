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
    public void setAndGetEmpId() {
        Employee employee = new Employee();
        assertEquals("New Employee must have empId = 0", 0, employee.getEmpId());
        employee.setEmpId(-1);
        assertEquals("Employee must have empId >= 0", -1, employee.getEmpId());
        employee.setEmpId(1);
        assertEquals("Employee must have empId >= 0", 1, employee.getEmpId());
    }

    @Test
    public void setAndGetJobTitle() {
        Employee employee = new Employee();
        employee.setJobTitle("JobTitle");
        assertEquals("JobTitle", employee.getJobTitle());
    }


    @Test
    public void setAndGetCompanyName() {
        Employee employee = new Employee();
        employee.setCompanyName("CompanyName");
        assertEquals("CompanyName", employee.getCompanyName());
    }

    @Test
    public void setAndGetSalary() {
        Employee employee = new Employee();
        employee.setSalary(0.0);
        assertEquals("Salary should be >= 0", 0.0, employee.getSalary(),0);

    }
    @Test
    public void setAndGetSalaryNegative() {
        Employee employee = new Employee();
        employee.setSalary(1.0);
        assertEquals("Salary should be >= 0",-1.0, employee.getSalary(),0);
    }
    @Test
    public void setAndGetSalaryPositive() {
        Employee employee = new Employee();
        employee.setSalary(1.0);
        assertEquals("Salary should be >= 0", 1.0, employee.getSalary(),0);
    }

    @Test
    public void checkEmployeeIsIntroducedProperly() {
       Employee employee = new Employee();
       employee.setFirstName("Bobby");
       employee.setSecondName("Stepper");
       employee.setAge(28);
       employee.setJobTitle("Developer");
       employee.setCompanyName("Accenture");
       assertEquals("My name is Bobby Stepper and i am 28 years old.\n I am work as Developer in Accenture.", employee.introduce());

    }

}