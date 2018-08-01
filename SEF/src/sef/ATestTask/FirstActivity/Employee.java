package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    public int empId;
    public String jobTitle;
    public String CompanyName;
    public double salary;

    //TODO 1 create different constructors
    public Employee(){
     this.empId=1234;
     this.jobTitle="java developer";
     this.CompanyName="accenture";
     this.salary=20000;
    }
 public Employee(int empId, String jobTitle, String companyName, double salary){
        this.empId=empId;
        this.jobTitle=jobTitle;
        this.CompanyName=companyName;
        this.salary=salary;
 }
    //TODO 2 add getters and setters
public int getEmpId(){
        return empId;
}
public void setEmpId(int empId){
        this.empId=empId;
}

public String getJobTitle(){
        return  jobTitle;
}
public void setJobTitle(String jobTitle){
        this.jobTitle= jobTitle;
}
public String getCompanyName(){
        return CompanyName;
}
public void setCompanyName(String companyName){
        this.CompanyName=companyName;
}
public double getSalary(){
        return salary;
}
public void setSalary(double salary){
        this.salary=salary;
}
}