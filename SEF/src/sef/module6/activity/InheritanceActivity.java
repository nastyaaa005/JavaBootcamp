package sef.module6.activity;


import sef.module14.sample.Employee;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		// Create Person object p. Write code to and set name of Person as Sarah Johnson
		// and age as 21
		Person_I p1= new Person_I("sarah jhonson",21);
		Person_I p2= new Person_I("sarah jhonson",21);
		p2.setname("sarah jhonson");
		p2.setage(21);

		
		
		System.out.println("-----------------------------");
		//Create Employee object e and 
		// set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
		Employee_I e1= new Employee_I("jhon", 55);
		e1.setSalary(7000);
		e1.setTitle("developer");
		e1.setAge(32);
		e1.setName("shawn cun");

		
		
		// Print Info using Employee object
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + e1.getName());
		System.out.println("Employee's Age is    : " + e.getAge());
		System.out.println("Employee's Title is  : " + e.getTitle());
		System.out.println("Employee's Salary is : " + e.getSalary());
		
		
		// Print Info using Person object
		System.out.println("-----------------------------");
		System.out.println("Person's Name is    : " + p.getName());
		System.out.println("Person's Age is     : " + p.getAge());
		
			
		
	}

}
