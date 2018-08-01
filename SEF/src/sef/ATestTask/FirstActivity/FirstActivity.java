package sef.ATestTask.FirstActivity;
import java.util.*;

import static java.lang.System.*;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result
		HashMap emap=new HashMap();
             Employee employee=new Employee();
             Employee employee1=new Employee(1, "developer", "accenture",150.0);
		     Employee employee2=new Employee(2, "tester", "accenture",160.0);
		     Employee employee3=new Employee(3, "analyst", "accenture",170.0);
		     Employee employee4=new Employee(4, "HR", "accenture",180.0);
		     Employee employee5=new Employee(3, "manager", "accenture",190.0);


		     emap.put(1,employee1);
		     emap.put(2,employee2);
		     emap.put(3,employee3);
		     emap.put(4,employee4);
		     emap.put(5,employee5);
		Collection c1 = emap.values();
		Iterator Itr = c1.iterator();


		while(Itr.hasNext()){
			Employee e = (Employee) Itr.next();
			System.out.println(e.getEmpId()+"\t" + e.getCompanyName()+"\t" +e.getJobTitle()+"\t" +e.getSalary()+"\t");

		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result
		Person p = new Person();

		Student s = new Student();

		Employee e =new Employee(1, "analyst", "accenture", 150);

		System.out.println("\n \n ******\n \n");
		System.out.println("My Name Is " +p.firstName + " " + p.secondName + "\n My Age is" + p.age );
        System.out.println("\n \n ******\n \n");
        System.out.println("My Name Is " +s.name + "\n" + "My Student Id is " + s.studentId + "\n" + "My Age Is" +s.age);
        System.out.println("\n \n ******\n \n");
		System.out.println("My Employee Id id " +e.empId + "\n" + "My Job Title is " + e.jobTitle +
                "\n" + "My Company Name is" +e.CompanyName + "/n"+ "My salary is" + e.salary);
		//TODO 4 Create method for total change employee information
		// for example some employee change his work
if (e.jobTitle.equals("analyst")){
	e.salary = 170;
	e.jobTitle = "analyst";
	e.CompanyName = "accenture";
	e.empId = 0001;
	System.out.println("\n \n ******\n \n");
	System.out.println("The New Employee Details Are " + "\n");
	System.out.println("My Employee Id is " + e.empId + "\n" + "My Job Title is " + e.jobTitle + "\n" +
            "I work in Company" + e.CompanyName + "\n" + "My Salary is " +e.salary);

}

	}

	
	
}
