package sef.ATestTask.FirstActivity;

import java.util.ArrayList;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)

        // create Employee objects
		Employee e0 = new Employee();
		Employee e1 = new Employee(1, "Dev", "ABC", 1200);
		Employee e2 = new Employee(3, "Dev", "XYZ", 2000);
		Employee e3 = new Employee(4, "Tester", "QAZ", 1000);
        Employee e4 = new Employee(2, "Tester", "QWE", 1800);
        Employee e5 = new Employee(5, "Manager", "ASD", 2200);
        Employee e6 = new Employee(6, "Manager", "ZXC", 1800);

        // create collection and add the objects
        ArrayList<Employee> empCol = new ArrayList();
        empCol.add(e0);
        empCol.add(e1);
        empCol.add(e2);
        empCol.add(e3);
        empCol.add(e4);
        empCol.add(e5);
        empCol.add(e6);

		//		System.out.println() result
        for(int i = 0; i < empCol.size(); i++) {
            empCol.get(i).announce();
        }

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result
        Person p = new Person("Fn", "Sn", 22);
        p.announce();
        Person P = new Student();
        p.announce();
        //Employee pse = (Employee)ps;
        //pse.announce();


		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}

	
	
}
