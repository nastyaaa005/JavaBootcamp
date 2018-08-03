package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    //deafult
    public Employee(){
        this.companyName = "Unknown";
        this.empId = 0;
        this.jobTitle = "Unknown";
        this.salary = 0.00;

    }
    //parametrized
    public Employee(String companyName, int empId, String jobTitle, double salary){
        this.companyName = companyName;
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //TODO 2 add getters and setters

    //CompanyName getter
    public String getCompanyName() {
        return companyName;
    }

    //CompanyName setter
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //JobTitle getter
    public  String getJobTitle()
    {
        return jobTitle;
    }

    //JobTitle setter
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //Salary getter
    public double getSalary() {
        return salary;
    }

    //Salary setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //EmpID getter
    public int getEmpId() {
        return empId;
    }

    //EmpID setter
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    //TODO 3 override method announce()


    @Override
    public String announce() {
        return super.announce() + "I am work as "+ getJobTitle()+" in "+getCompanyName();
    }
    //TODO 4: Method for change of all information

    public void reSet(String companyName, int empId, String jobTitle, double salary)
    {
        this.companyName = companyName;
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
}