package sef.ATestTask.FirstActivity;

public class Employee extends Person {

     int empId;
     String jobTitle;
   String companyName;
     double salary;

    //TODO 1 create different constructors

    public void setEmpId(int empId){
        this.empId=empId;
    }
    public int getemId() {
        return empId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public String announce(){
        return "\nmy id is "+empId+"\n and my jobtitle is "+jobTitle;
    }
}
    //TODO 2 add getters and setters




