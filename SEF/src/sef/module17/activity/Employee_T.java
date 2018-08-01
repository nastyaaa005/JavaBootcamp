package sef.module17.activity;

public class Employee_T extends Person_T {
 private int salary;
 private String company;

    public void setSalary(int i) {
        this.salary=i;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany()
    {
        return company;
    }

    public String announce()
    {
      return  super.announce()+ "\nMy Company is " + company+ " and my salary is "+ salary;
    }
}
