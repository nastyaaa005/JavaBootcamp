package sef.ATestTask.FirstActivity;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result

		Person P1 = new Person();
		Person P2 = new Person("John", "Wick", 33);

		P1.setFirstName("Dima");
		P1.introduce();
		P2.introduce();


		Student L1 = new Student();
		Student L2 = new Student("Robert", "Wang", 46 );

		L1.setFirstName("Robert");
		L1.introduce();
		L2.introduce();

		Employee F1 = new Employee();
		Employee F2 = new Employee(234, "engineer", "ABC" , 456.29 );

		F1.empId(123);
		F1.setJobTitle("Developer");

		F1.introduce();
		F2.introduce();


	}
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

	
	

