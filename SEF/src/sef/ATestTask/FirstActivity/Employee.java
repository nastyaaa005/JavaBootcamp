package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        this.empId = 1;
        this.jobTitle = "developer";
        this.companyName = "Sonar";
        this.salary = 2000.00;
    }

    //TODO 2 add getters and setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getJobTitle() { return jobTitle; }

    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    public String getCompanyName() { return companyName; }

    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }

    public static void main(String[ ] args) {
        Employee one = new Employee();
        System.out.println("My name is " +  one.firstName + " " + one.secondName + " and I am " + one.age + " years old.");
        System.out.println("I work as " +  one.jobTitle + " in " + one.companyName + ".");
    }

}