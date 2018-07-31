package sef.module17.activity;

public class Employee_T extends Person_T {

    private double salary;

    public void setSalary(double i) {
        this.salary = i;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String announce() {
        return super.announce() + " My salary is " + getSalary() + " EUR per year.";
    }
}
