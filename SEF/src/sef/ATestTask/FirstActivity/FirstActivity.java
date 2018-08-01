package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result
		Person p1 = new Person();
		p1.setAge(18);
		p1.setFirstName("John");
		p1.setSecondName("Don");
		p1.announce();

		Employee e1 = new Employee();
		e1.setAge(32);
		e1.setFirstName("John");
		e1.setSecondName("Boyl");

		Employee e2 = new Employee(1,"Dev", "Apple", 1000.33);
		e2.setAge(23);
		e2.setFirstName("Mary");
		e2.setSecondName("Rose");


		Employee e3 = new Employee(1,"Manager", "Forex", 1500);
		e3.setAge(67);
		e3.setFirstName("Tom");
		e3.setSecondName("Bush");


		Employee e4 = new Employee(1,"Cleaner","LU", 500);
		e4.setAge(51);
		e4.setFirstName("Ivan");
		e4.setSecondName("Ivanov");

		Employee e5 = new Employee(1,"Tester","Global", 1800);
		e5.setAge(31);
		e5.setFirstName("Jony");
		e5.setSecondName("Moon");

		e1.announce();
		e2.announce();
		e3.announce();
		e4.announce();
		e5.announce();


		List<Employee> list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);



		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getFirstName() + " have Salary = " + list.get(i).getSalary());
		}

		Student s1 = new Student();
		s1.setAge(15);
		s1.setFirstName("George");
		s1.setSecondName("Small");
		s1.setSchoolName("LU");
		s1.announce();

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result


		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}

	
	
}
