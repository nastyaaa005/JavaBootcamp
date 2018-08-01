package sef.ATestTask.FirstActivity;

public class Employee extends Person {


    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
    }


    public Employee(int empID, String jobTitle, String companyName, double salary) {

        this.empId = empID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;

    }


    public int empId() {
        return empId;
    }

    public void empId(int empId) {
        this.empId = empId;
    }


    public String jobTitle() {
        return jobTitle;
    }


    public void setJobTitle(String Jobtitle) {
        this.jobTitle = Jobtitle;
    }

    public String companyName() {
        return companyName;
    }

    public void companyName(String companyName) {
        this.companyName = companyName;
    }

    public Double salary() {
        return salary;
    }

    public void salary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("I am work as " + jobTitle + " in company " + companyName);


    }
}








        //TODO 2 add getters and setters


