package sef.module17.activity;

public class Employe_T extends Person_T {

    private int salary;

    public void setSalary(int i) {
        this.salary= i;
    }

    public int getSalary() {
        return salary;
    }
    public String announce(){
        return super.announce() + "My salary is "+ getSalary();
    }
}
