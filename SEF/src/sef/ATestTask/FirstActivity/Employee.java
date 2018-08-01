package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
    this.empId=0;
    this.jobTitle="";
    this.companyName="";
    this.salary=0.0;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //TODO 2 add getters and setters
    public Employee(int id, String title, String company, double salary){
        this.empId=id;
        this.jobTitle=title;
        this.companyName=company;
        this.salary=salary;
    }


    public String uknown()

    {return  "My name is "+getFirstName()+" "+getSecondName()+" and i am "+getAge()+" years old" +
            "I am work as "+jobTitle+" in "+companyName+""; }

  //"My name is <name> and i am <age> years old
 //   I am work as <jobTitle> in <company>"

}