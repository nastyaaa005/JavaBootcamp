package sef.module17.activity;

public class Employee_T extends Person_T {
    private int salary;
    private String title;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String announce() {
        return  super.announce() + ", I am a " + getTitle() + " and my salary is " + getSalary();
    }
}
