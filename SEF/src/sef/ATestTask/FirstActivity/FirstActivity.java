package sef.ATestTask.FirstActivity;

import java.util.ArrayList;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result
		Employee e1 = new Employee(1, "Developer", "Accenture", 1000);
		e1.setFirstName("Bobby");
		e1.setSecondName("Stepper");
		e1.setAge(28);
		System.out.println(e1.introduce());

		Employee e2 = new Employee(2, "Tester", "Accenture", 1100);
		e2.setFirstName("Maggie");
		e2.setSecondName("Dawson");
		e2.setAge(24);
		System.out.println(e2.introduce());

		Employee e3 = new Employee(3, "QA", "Accenture", 1500);
		e3.setFirstName("Susan");
		e3.setSecondName("White");
		e3.setAge(32);
		System.out.println(e3.introduce());

		Employee e4 = new Employee(4, "Manager", "Accenture", 1800);
		e4.setFirstName("Alex");
		e4.setSecondName("Black");
		e4.setAge(40);
		System.out.println(e4.introduce());

		Employee e5 = new Employee(5, "Team Leader", "Accenture", 1800);
		e5.setFirstName("David");
		e5.setSecondName("Ginger");
		e5.setAge(35);
		System.out.println(e5.introduce());

		Employee e6 = new Employee(6, "Creative Director", "Accenture", 2100);
		e6.setFirstName("Toby");
		e6.setSecondName("Jhonson");
		e6.setAge(34);
		System.out.println(e6.introduce());

		Employee e7 = new Employee(7, "Office Administrator", "Accenture", 700);
		e7.setFirstName("Margaret");
		e7.setSecondName("Wilson");
		e7.setAge(21);
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
		public static ArrayList<Employee> sortEmployeesBySalaryFromMaxToMin (ArrayList < Employee > e1List) {

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
		// for example some employee change his work


