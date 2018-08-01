package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
@Test
    public void setAndgetEmpIdZero(){
        Employee employee= new Employee();
        employee.setEmpId(0);
        assertEquals("Employee must have empId >=0",0, employee.getEmpId());}
    @Test
    public void setAndgetEmpIdNegative(){
        Employee employee= new Employee();
        employee.setEmpId(-1);
        assertEquals("Employee must have empId >=0",0,employee.getEmpId());}

    @Test
    public void getAndsetJobTitle() {
        Employee employee = new Employee();
        employee.setJobTitle("job title");
        assertEquals("job title", employee.getJobTitle());
    }
    @Test

    public void getAndsetCompanyName() {
    Employee employee=new Employee();
    employee.setCompanyName("Company name");
    assertEquals("Company name", employee.getCompanyName());
    }


    @Test
    public void getAndsetSalary(){
    Employee employee= new Employee();
    employee.setSalary(1000.0);
    assertEquals("Salary should be >=0",1000,employee.getSalary(),0);
    }

    @Test
    public void getAndsetSalaryNegative(){
        Employee employee= new Employee();
        employee.setSalary(-100.0);
        assertEquals("Salary should be >=0",0,employee.getSalary(),0);
    }

    @Test
    public void announce() {
    Employee employee=new Employee();
        employee.setFirstName("Alesha");
        employee.setSecondName("Popovich");
        employee.setAge(33);
        employee.setJobTitle("Developer");
        employee.setCompanyName("Accenture");
        assertEquals("My name is Alesha Popovich and I am 33 years old. I am work as Developer in Accenture.",
                employee.announce());

    }


}
