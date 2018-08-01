package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {
		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result
		Employee emp1 = new Employee(1, "Crupier", "Evolution gaming", 1000.7);
		emp1.setFirstName("Borya");
		emp1.setSecondName("Gorbunkov");
		emp1.setAge(22);
		System.out.println(emp1.announce());

		Employee emp2 = new Employee(2, "Developer", "Accenture", 20040.2);
		emp2.setFirstName("Alesha");
		emp2.setSecondName("Popovich");
		emp2.setAge(33);
		System.out.println(emp2.announce());

		Employee emp3 = new Employee(3, "Florist", "Flower home", 510.98);
		emp3.setFirstName("Elena");
		emp3.setSecondName("Dobro");
		emp3.setAge(24);
		System.out.println(emp3.announce());

		Employee emp4 = new Employee(4, "Makeup artist", "Poetica", 870.12);
		emp4.setFirstName("Valerija");
		emp4.setSecondName("Puchko");
		emp4.setAge(28);
		System.out.println(emp4.announce());

		Employee emp5 = new Employee(5, "Plumber", "Ku&Co", 1248.09);
		emp5.setFirstName("Vyachislav");
		emp5.setSecondName("Kukorjaka");
		emp5.setAge(45);
		System.out.println(emp5.announce());

		Employee emp6 = new Employee(6, "Cashier", "Maxima", 350.99);
		emp6.setFirstName("Ljubov");
		emp6.setSecondName("Mihailova");
		emp6.setAge(52);
		System.out.println(emp6.announce());

		ArrayList<Employee> emp1List = new ArrayList<>();
		emp1List.add(emp1);
		emp1List.add(emp2);
		emp1List.add(emp3);
		emp1List.add(emp4);
		emp1List.add(emp5);
		emp1List.add(emp6);
		emp1List = salaryFromMintoMax(emp1List);
		for (Employee e : emp1List) {
			System.out.println(e.announce() + "Salary: " + e.getSalary());

		}
	}

	//TODO 2 sort and this employees by salary (from min to max)
	// TIP - google bubble sort
	//		System.out.println() result
	public static ArrayList<Employee> salaryFromMintoMax(ArrayList<Employee> emp1List) {
		int Salary = 0;
		int x = 0;
		Employee first;
		Employee next;

		int arraySize = emp1List.size();

		while (true) {
			first = emp1List.get(x);
			next = emp1List.get(x + 1);
			if (first.getSalary() < next.getSalary()) {
				Employee a = first;
				emp1List.set(x, next);
				emp1List.set(x + 1, a);
				Salary = 0;
			} else {
				Salary++;
			}
			x++;
			if (x == arraySize - 1) {
				x = 0;
			}
			if (Salary == arraySize - 1)
				break;
		}
		return emp1List;


	}
}


	//TODO 3 create instance of the Person ->
	// than make them Student
	// than make them Employee
	//		System.out.println() result

	//TODO 4 Create method for total change employee information
	// for example some employee change his work


//Sort employees by first and second name




	

