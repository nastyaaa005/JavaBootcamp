package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        super();
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0.0;
    }

    //2.1 Add different constructors
    public Employee(int empId){
        super();
        this.empId = empId;
    }

    public Employee(int empId, String jobTitle){
        super();
        this.empId = empId;
        this.jobTitle = jobTitle;
    }

    public Employee(int empId, String jobTitle, String companyName){
        super();
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;

    }
    public Employee(int empId, String jobTitle, String companyName, double salary){
        super();
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;

    }

    public Employee(int empId, String jobTitle, String companyName, double salary, String firstName, String secondName,
                    int age){
        super(firstName, secondName, age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
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

//     2.3 Add method for introduce of person ->
//            "My name is <name> and i am <age> years old
//             I am work as <jobTitle> in <company>"

    @Override
    public String introduceMyself(){
        return super.introduceMyself() +
                "\nI am working as " + getJobTitle() + " in " + getCompanyName() + ".";
    }


    public void employeeInformationTotalChange(int empId, String jobTitle, String companyName, double salary){

        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

}