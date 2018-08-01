package sef.ATestTask.FirstActivity;


public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result

		Employee emp1 = new Employee();

		emp1.setSalary(88.88);
		emp1.setFirstName("kostya");
		emp1.setjobTitle("dev");
		emp1.setCompanyName("Philips");

		System.out.println(emp1.getSalary());
		System.out.println( emp1.announce());

		System.out.println("######################");


		Student kostya = new Student();
		kostya.setFirstName("Micky");
		kostya.setAge(12);
		kostya.setGrade(8);
		kostya.setSchoolNamee("lu");
		System.out.println( kostya.announce());


		Employee e1 = new Employee();
		e1.setSalary(77.99);

		Employee e2 = new Employee(123, "manager", "Philips", 66.99);



		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}

	
	
}


/*

public class Programme {
	public static void main(String args[]) {
		Person_t person1 = new Person_t();
		Student_t student1 = new Student_t();
		Employee_t empl1 = new Employee_t();

		student1.setGrade(2);
		student1.setSchool("Oxford");
		student1.setName("John");
		student1.setAge(22);

		student1.announce();

		System.out.println(student1.getGrade());

	}

}
*/