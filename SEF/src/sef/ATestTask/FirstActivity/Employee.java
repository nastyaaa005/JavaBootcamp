package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    public int empId;
    public String jobTitle;
    public String companyName;
    public double salary;

    //TODO 1 create different constructors
    //Behaviour - default constructor
    /*public Employee(){
        this.empId= 123;
        this.jobTitle= "Test Analyst";
        this.companyName= "Accenture";
        this.salary= 50000;

    }*/
    //Behaviour- parameterized constructor
    public Employee(int empId, String jobTitle, String companyName,double salary){
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters
    //getter and setter for empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId){
        this.empId= empId;
    }

    //getter and setter for jobTitle
    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //getter and setter for companyName
    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }

    //getter and setter for salary

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}