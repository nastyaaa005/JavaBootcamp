package sef.ATestTask.FirstActivity;

import java.io.Serializable;

public  class Employee extends Person implements Serializable {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){ //default
        this.empId=0;
        this.jobTitle="";
        this.companyName="";
        this.salary=0.0;

    }
    public Employee(int id,String title,String company,double salary){ //default
        this.empId=id;
        this.jobTitle=title;
        this.companyName=company;
        this.salary=salary;

    }

    public Employee(String nameF,String nameS, int age,int id,String title,String company,double salary){ //default
       super.setAge(age);
        try {
            super.setFirstName(nameF);
        }catch (IllegalArgumentException e) {


        }
        try {
            super.setSecondName(nameS);
        }catch (IllegalArgumentException e) {

        }
        this.empId=id;
        this.jobTitle=title;
        this.companyName=company;
        this.salary=salary;

    }
    //TODO 2 add getters and setters
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


 public String introduce(){

        return super.introduce() + " I am work as "+jobTitle+" in "+companyName;
 }


  public String toFile(){
        return "\r\n"+getFirstName()+" "+getSecondName() +" "+getAge() +" "+getEmpId()+" "+getCompanyName()+" "+getJobTitle()+" "
                +getSalary();
    }
}