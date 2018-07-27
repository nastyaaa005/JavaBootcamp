package sef.module6.activity;


import sef.module6.sample.Person_I;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		// Create Person object p. Write code to and set name of Person as Sarah Johnson
		// and age as 21

		Person_I p1 = new Person_I("Sarah Johnson", 21);
		Person_I p2 = new Person_I();
		p2.setName("Sarah Johnson");
		p2.setAge(21);
		
		
		System.out.println("-----------------------------");
		//Create Employee object e and 
		// set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
		
		Employee_I e1 = new Employee_I();
		e1.setName("Shawn Cun");
		e1.setAge(32);
		e1.setSalary(70000);
		e1.setTitle("Developer");

		
		// Print Info using Employee object
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + e1.getName());
		System.out.println("Employee's Age is    : " + e1.getAge());
		System.out.println("Employee's Title is  : " + e1.getTitle());
		System.out.println("Employee's Salary is : " + e1.getSalary());
		
		
		// Print Info using Person object
		System.out.println("-----------------------------");
		System.out.println("Person's Name is    : " + p2.getName());
		System.out.println("Person's Age is     : " + p2.getAge());
		
			
		
	}

}
