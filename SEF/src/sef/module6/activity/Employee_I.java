package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I {
	private String title;
	private double salary;
	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	public Employee_I(){System.out.println("I'm Employee_A constructor");}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public String getTitle() {
		return title;
	}


}


	

