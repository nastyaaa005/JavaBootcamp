package sef.ATestTask.FirstActivity;


import java.util.ArrayList;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result

		Employee e1 = new Employee(1, "Candy maker", "Comics", 1000);
		e1.setFirstName("Ed");
		e1.setSecondName("Boy");
		e1.setAge(21);
		System.out.println(e1.introduce());

		Employee e2 = new Employee(2, "Candy maker", "Comics", 2000);
		e2.setFirstName("Edd");
		e2.setSecondName("Boy");
		e2.setAge(22);
		System.out.println(e2.introduce());

		Employee e3 = new Employee(3, "Candy maker", "Comics", 3000);
		e3.setFirstName("Eddy");
		e3.setSecondName("Boy");
		e3.setAge(23);
		System.out.println(e3.introduce());

		Employee e4 = new Employee(4, "God", "Comics", 4000);
		e4.setFirstName("Loki");
		e4.setSecondName("Odinson");
		e4.setAge(24);
		System.out.println(e4.introduce());

		Employee e5 = new Employee(5, "God", "Comics", 5000);
		e5.setFirstName("Thor");
		e5.setSecondName("Odinson");
		e5.setAge(25);
		System.out.println(e5.introduce());

		Employee e6 = new Employee(6, "Batman", "Comics", 6000);
		e6.setFirstName("Bruce");
		e6.setSecondName("Wayne");
		e6.setAge(26);
		System.out.println(e6.introduce());

		Employee e7 = new Employee(7, "Engineer", "Comics", 7000);
		e7.setFirstName("Tony");
		e7.setSecondName("Stark");
		e7.setAge(27);
		System.out.println(e7.introduce());


		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		ArrayList<Employee> e1List = new ArrayList<>();
		e1List.add(e1);
		e1List.add(e2);
		e1List.add(e3);
		e1List.add(e4);
		e1List.add(e5);
		e1List.add(e6);
		e1List.add(e7);
		e1List = sortEmployeesBySalaryFromMaxToMin(e1List);

		for (Employee e : e1List) {
			System.out.println(e.introduce() + " Salary: " + e.getSalary());
		}
	}

	public static ArrayList<Employee> sortEmployeesBySalaryFromMaxToMin(ArrayList<Employee> e1List) {

		int goodPairsCounter = 0;
		int i = 0;
		Employee first;
		Employee next;

		int ArraySize = e1List.size();

		while (true) {
			first = e1List.get(i);
			next = e1List.get(i + 1);

			if (first.getSalary() < next.getSalary()) {
				Employee x = first;
				e1List.set(i, next);
				e1List.set(i + 1, x);
				goodPairsCounter = 0;
			} else {
				goodPairsCounter++;
			}
			i++;
			if (i == ArraySize - 1) {
				i = 0;
			}
			if (goodPairsCounter == ArraySize - 1) break;
		}
		return e1List;
	}
}


		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result





		//TODO 4 Create method for total change employee information
//		// for example some employee change his work







	
	
