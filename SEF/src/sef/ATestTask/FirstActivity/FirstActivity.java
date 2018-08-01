package sef.ATestTask.FirstActivity;

import java.util.*;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)

		//Collection of Employee (more than 5)
		Map<Integer,Employee> emap= new HashMap();
		Employee emp1 = new Employee(1,"Developer", "Accenture", 100.0);
		Employee emp2 = new Employee(2,"Tester", "Wipro", 200.0);
		Employee emp3 = new Employee(3," Test Analyst ", " Deloitte ", 400.0);
		Employee emp4 = new Employee(4," Java Developer ", " Google ", 300.0);
		Employee emp5 = new Employee(5," Test Automation ", " IBM ", 400.0);
		Employee emp6 = new Employee(6," Senior Test Analyst ", " Yahoo ", 500.0);
		emap.put(1,emp1);
		emap.put(2,emp2);
		emap.put(3,emp3);
		emap.put(4,emp4);
		emap.put(5,emp5);
		emap.put(6,emp6);
		Collection cl = emap.values();
		Iterator itr = cl.iterator();

		//		System.out.println() result
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort

		//		System.out.println() result

		//TODO 3 create instance of the Person ->
            Person p = new Person();

		// than make them Student
		Student s = new Student();

		// than make them Employee
		Employee e = new Employee(1,"Test Analyst", "Accenture", 100.0);


		//		System.out.println() result
        System.out.println("\n \n *********************************************************** \n \n");
		System.out.println("My Name Is " + p.firstName + " " + p.secondName + "\n My Age Is " + p.age );
        System.out.println("\n \n *********************************************************** \n \n");
		System.out.println(" My Name Is " + s.name + "\n" + " My Student ID is " + s.studentId + "\n" + " My age is " + s.age + "\n" + " I'm studying in " + s.uni);
        System.out.println("\n \n *********************************************************** \n \n");
		System.out.println(" My Employee ID is " + e.empId + "\n" + " My Job Title is " + e.jobTitle + "\n" +
				" I work in company " + e.companyName +"\n" + " My Salary is " + e.salary);

		//TODO 4 Create method for total change employee information
		// for example some employee change his work
        while (e.jobTitle == "Java Developer"){
            e.salary = 700.0;
            e.jobTitle = "DevOPs";
            e.companyName = "LV";
            e.empId = 108;
            System.out.println("\n \n *********************************************************** \n \n");
            System.out.println(" The new Employee details are " +  "\n");
            System.out.println(" My Employee ID is " + e.empId + "\n" + " My Job Title is " + e.jobTitle + "\n" +
                    " I work in company " + e.companyName +"\n" + " My Salary is " + e.salary);
        }


	}

	
	
}
