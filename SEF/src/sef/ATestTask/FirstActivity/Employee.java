package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    public int empId;
    public String jobTitle;
    public String companyName;
    public double salary;

    //TODO 1 create different constructors
    public Employee(){
     this.empId=1234;
     this.jobTitle="java developer";
     this.companyName="accenture";
     this.salary=20000;
    }
 public Employee(int empId, String jobTitle, String companyName, double salary){
        this.empId=empId;
        this.jobTitle=jobTitle;
        this.companyName=companyName;
        this.salary=salary;
 }
    //TODO 2 add getters and setters
public int getEmpId(){
        return empId;
}
public void setEmpId(int empId){
        this.empId=1234;
}

public String getJobTitle(){
        return  jobTitle;
}
public void setJobTitle(String jobTitle){
        this.jobTitle= jobTitle;
}
public String getCompanyName(String companyName){
        return companyName;
}
public void setCompanyName(){
        this.companyName=companyName;
}
public double getSalary(){
        return salary;
}
public void setSalary(double salary){
        this.salary=salary;
}
}