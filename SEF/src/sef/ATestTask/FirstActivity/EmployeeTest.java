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

    //5) Create unit test for ALL classes (example in EmployeeTest)

    @Test
    public void setAndGetEmpIdNegative() {
        Employee employee = new Employee();
        employee.setEmpId(-1);
        assertEquals("Employee must have emplId >= 0", 0, employee.getEmpId());
    }

    @Test
    public void setAndGetEmpIdEqualAndGraterThatZero() {
        Employee employee = new Employee();
        employee.setEmpId(1);
        assertEquals("Employee must have emplId >= 0", 1, employee.getEmpId());
    }

    @Test
    public void setAndGetJobTitle() {
        Employee employee = new Employee();
        employee.setJobTitle("TestJobTitle");
        assertEquals("TestJobTitle", employee.getJobTitle());
    }

    @Test
    public void setAndGetCompanyName() {
        Employee employee = new Employee();
        employee.setCompanyName("TestCompanyName");
        assertEquals("TestCompanyName", employee.getCompanyName());
    }

    @Test
    public void setAndGetSalary() {
        Employee employee = new Employee();
        employee.setSalary(10000.0);
        assertEquals(10000.0, employee.getSalary(),0);
    }

    @Test
    public void setAndGetSalaryNegative() {
        Employee employee = new Employee();
        employee.setSalary(-10000.0);
        assertEquals("Salary is set negative, should be zero or positive", 0.0, employee.getSalary(),0);
    }

    @Test
    public void setAndGetSalaryInteger() {
        Employee employee = new Employee();
        employee.setSalary(10000);
        assertEquals("Salary is set negative, should be zero or positive", 10000.0, employee.getSalary(),0);
    }

    @Test
    public void introduceMyself() {

        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setSecondName("Marple");
        employee.setAge(25);
        employee.setEmpId(1);
        employee.setJobTitle("Test Developer");
        employee.setCompanyName("Test Company");
        employee.setSalary(10);
        assertEquals("My name is John Marple and I am 25 years old.\nI am working as Test Developer in Test Company.",
                employee.introduceMyself());
    }

    @Test
    public void employeeInformationTotalChange() {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setSecondName("Marple");
        employee.setAge(25);
        employee.setEmpId(1);
        employee.setJobTitle("Test Developer");
        employee.setCompanyName("Test Company");
        employee.setSalary(10);

        employee.employeeInformationTotalChange(2, "Test Tester", "Test Company 2", 15.0);

        assertEquals(2 , employee.getEmpId());
        assertEquals("John", employee.getFirstName());
        assertEquals("Marple", employee.getSecondName());
        assertEquals(25, employee.getAge());;
        assertEquals("Test Tester", employee.getJobTitle());
        assertEquals("Test Company 2", employee.getCompanyName());
        assertEquals(15, employee.getSalary(), 0);

    }

    @Test
    public void testConstructorDefault(){
        Employee employee = new Employee();
        assertEquals(0, employee.getEmpId());
        assertEquals("Unknown", employee.getFirstName());
        assertEquals("Unknown", employee.getSecondName());
        assertEquals(0, employee.getAge());;
        assertEquals("Unknown", employee.getJobTitle());
        assertEquals("Unknown", employee.getCompanyName());
        assertEquals(0.0, employee.getSalary(), 0);

    }

    @Test
    public void testEmployeeConstructorEmplId(){
        Employee employee = new Employee(1);
        assertEquals(1, employee.getEmpId());
        assertEquals("Unknown", employee.getFirstName());
        assertEquals("Unknown", employee.getSecondName());
        assertEquals(0, employee.getAge());;
        assertEquals(null, employee.getJobTitle());
        assertEquals(null, employee.getCompanyName());
        assertEquals(0.0, employee.getSalary(), 0);
    }

    @Test
    public void testEmployeeConstructorIdJob(){
        Employee employee = new Employee(1, "Developer");
        assertEquals(1, employee.getEmpId());
        assertEquals("Unknown", employee.getFirstName());
        assertEquals("Unknown", employee.getSecondName());
        assertEquals(0, employee.getAge());;
        assertEquals("Developer", employee.getJobTitle());
        assertEquals(null, employee.getCompanyName());
        assertEquals(0.0, employee.getSalary(), 0);

    }

    @Test
    public void testEmployeeConstructoreIdJobCompany(){
        Employee employee = new Employee(1, "Developer", "TestCompany");
        assertEquals(1, employee.getEmpId());
        assertEquals("Unknown", employee.getFirstName());
        assertEquals("Unknown", employee.getSecondName());
        assertEquals(0, employee.getAge());;
        assertEquals("Developer", employee.getJobTitle());
        assertEquals("TestCompany", employee.getCompanyName());
        assertEquals(0.0, employee.getSalary(), 0);
    }

    @Test
    public void testEmployeeConstructorIdJobCompanySalary(){
        Employee employee = new Employee(1, "Developer", "TestCompany", 1000.0);
        assertEquals(1, employee.getEmpId());
        assertEquals("Unknown", employee.getFirstName());
        assertEquals("Unknown", employee.getSecondName());
        assertEquals(0, employee.getAge());;
        assertEquals("Developer", employee.getJobTitle());
        assertEquals("TestCompany", employee.getCompanyName());
        assertEquals(1000.0, employee.getSalary(), 0);
    }

    @Test
    public void testEmployeeConstructorAllProperties(){
        Employee employee = new Employee(1, "TestDeveloper", "TestCompany", 1000.0, "John", "Marple", 20);

        assertEquals(1, employee.getEmpId());
        assertEquals("John", employee.getFirstName());
        assertEquals("Marple", employee.getSecondName());
        assertEquals(20, employee.getAge());;
        assertEquals("TestDeveloper", employee.getJobTitle());
        assertEquals("TestCompany", employee.getCompanyName());
        assertEquals(1000.0, employee.getSalary(), 0);

    }
}