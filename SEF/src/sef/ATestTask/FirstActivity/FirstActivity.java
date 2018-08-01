package sef.ATestTask.FirstActivity;

import java.util.*;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result
		Map<Integer, Employee> employees =new HashMap<Integer, Employee>();
		Employee one = new Employee(1, "tester", "Sonar", 1500.00);
		Employee two = new Employee(2, "developer", "Sonar", 2000.00);
		Employee three = new Employee(3, "junior developer", "Sonar", 1000.00);
		Employee four = new Employee(4, "intern", "Sonar", 700.00);
		Employee five = new Employee(5, "assistant", "Sonar", 900.00);
		Employee six = new Employee(6, "senior developer", "Sonar", 2500.00);
        employees.put(1, one);
		employees.put(2, two);
		employees.put(3, three);
		employees.put(4, four);
		employees.put(5, five);
		employees.put(6, six);

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result
		ArrayList<Employee> bysalary = new ArrayList<Employee>();
//		Collections.sort(bysalary, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return 0;
//			}
//		});
		Collections.sort(bysalary, new SalaryComparator());
		for (Employee x : bysalary) {
			System.out.println("I work as a " +  x.getJobTitle() + " in company " + x.getCompanyName() + " and my salary is EUR " + x.getSalary() + ".");
		}

		//TODO 3 create instance of the Person ->
		Person first = new Person("Sara", "Smith", 30);
		System.out.println("My name is " + first.firstName + " " + first.secondName + " and I am " + first.age + " years old.");

		// than make them Student


		// than make them Employee

		//		System.out.println() result


		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}

	
	
}
