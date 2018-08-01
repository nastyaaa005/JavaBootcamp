package sef.ATestTask.FirstActivity;

//4) in file FirstActivity
//		4.1 create few employees
//		4.2 try to print them from top salary to less
//		4.3 create person who became a student, and after that became a employee (must be one instance)

import java.util.*;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		ArrayList<Employee> emplList = new ArrayList<>();
		emplList.add(new Employee(1, "Developer", "Acc", 70000, "Ivan", "Korolev", 35));
		emplList.add(new Employee(2, "Developer", "Acc", 70000, "Nikolay", "Panin", 37));
		emplList.add(new Employee(3, "Tester", "Acc", 60000, "Peter", "Bunin", 25));
		emplList.add(new Employee(4, "Tester", "Acc", 65000, "Svetlana", "Bunkova", 27));
		emplList.add(new Employee(5, "Project manager", "Acc", 100000, "Moisey", "Abramovich", 40));
		emplList.add(new Employee(6, "Senior developer", "Acc", 85000, "Ivan", "Manilov", 45));
		emplList.add(new Employee(1, "Lead developer", "Acc", 78000, "Artyom", "Lunin", 35));


//		System.out.println() result
		for (Person o : emplList){
			System.out.println(o.introduceMyself());
		}
		System.out.println("---------------------------------------");

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		emplList = sortEmployeesBySalaryFromMinToMax(emplList);
		//		System.out.println() result
		for (Employee o : emplList){
			System.out.println(o.introduceMyself() + " My salary is " + o.getSalary());
		}

		//TODO 3 create instance of the Person ->

		Person person = new Person("Vasiliy", "Pupkin", 12);
		System.out.println("---------------------------------------");
		System.out.println(person.introduceMyself());

		// than make them Student

//		Student tempStudent = (Student)person; // convert person to student
//		System.out.println(tempStudent.introduceMyself());

//		((Student) person).setSchoolName("Cambridge");
//		person.setAge(16);
//		((Student) person).setAverageGradeInYear(9.35);
//		System.out.println(((Student) person).introduceMyself());
//
//		((Employee) person).setAge(25);
//		((Employee) person).setCompanyName("Acc");
//		((Employee) person).setJobTitle("Jounior developer");
//		((Employee) person).setEmpId(8);
//		((Employee) person).setSalary(56000);
//
//		System.out.println(((Employee) person).introduceMyself());


//		//TODO 4 Create method for total change employee information
		// for example some employee change his work

		System.out.println("---------------------------------------");
		Employee e = new Employee(1, "Developer", "Acc", 70000, "Ivan", "Korolev", 35);
		System.out.println(e.introduceMyself() + " My salary is " + e.getSalary());
		e = employeeInformationTotalChange(e, 9, "Developer", "Acc-Fix", 25000);
		System.out.println(e.introduceMyself() + " My salary is " + e.getSalary());

	}

	public static Employee employeeInformationTotalChange(Employee empl, int empId, String jobTitle, String companyName, double salary){

		empl.employeeInformationTotalChange(empId, jobTitle, companyName, salary);
		return empl;
	}

	//sorting per salary from min to max
	public static ArrayList<Employee> sortEmployeesBySalaryFromMinToMax(ArrayList<Employee> emplList){

		int goodPairsCounter = 0;
		int i = 0;
		Employee first;
		Employee next;

		int arraySize = emplList.size();

		while (true) {

			first = emplList.get(i);
			next = emplList.get(i + 1);

			if (first.getSalary() < next.getSalary()) {
				Employee q = first;
				emplList.set(i, next);
				emplList.set(i+1, q);
				goodPairsCounter = 0;
			} else {
				goodPairsCounter++;
			}
			i++;
			if (i == arraySize - 1) {
				i = 0;
			}
			if (goodPairsCounter == arraySize - 1) break;
		}

		return emplList;
	}
	
}
