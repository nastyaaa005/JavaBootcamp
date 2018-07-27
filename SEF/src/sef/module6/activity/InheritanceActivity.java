package sef.module6.activity;



public class InheritanceActivity {

	public static void main(String[] args) {
		
		// Create Person object p. Write code to and set name of Person as Sarah Johnson
		// and age as 21
		Person_I p = new Person_I();
		p.setName("Greeshma Amidyala");
		p.setAge(21);
		p.getname();
		p.getage();

		
		
		System.out.println("-----------------------------");
		//Create Employee object e and 
		// set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
		Employee_I e = new Employee_I();
		//e.setName("Greeshma Amidyala");
		e.getname();
		e.setSalary(50000);
		e.getSalary();
		e.setTitle("Test Analyst");
		e.getTitle();
		//e.setAge(21);
		e.getage();
		
		
		// Print Info using Employee object
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + e.getname());
		System.out.println("Employee's Age is    : " + e.getage());
		System.out.println("Employee's Title is  : " + e.getTitle());
		System.out.println("Employee's Salary is : " + e.getSalary());
		
		
		// Print Info using Person object
		System.out.println("-----------------------------");
		System.out.println("Person's Name is    : " + p.getname());
		System.out.println("Person's Age is     : " + p.getage());
		
			
		
	}

}
