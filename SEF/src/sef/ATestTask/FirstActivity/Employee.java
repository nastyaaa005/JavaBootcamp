package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
    }

    public Employee(int id, String job, String companyName, double salary) {
        this.empId = id;
        this.jobTitle = job;
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters
    public int getId() {
        return empId;
    }

    public void setId(int id) {
        this.empId = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setjobTitle(String id) {
        this.jobTitle = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

     public String announce() {
       return   super.announce() + "\nI work as " + jobTitle + " in company " + companyName;
     }
    // System.out.println("My name is " + John);
    // System.out.println("I work as " + Manager in Philips company );
    // }

    //"My name is <name> and i am <age> years old
    // I am work as <jobTitle> in <company>"
}