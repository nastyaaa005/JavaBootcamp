package sef.ATestTask.FirstActivity;

import java.util.*;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)

		//Collection of Employee (more than 5)
		Map<Integer,Employee> emap= new HashMap();
		Employee emp1 = new Employee(1,"Developer", "Accenture", 100.0);
		Employee emp2 = new Employee(2,"Tester", "Wipro", 200.0);
		Employee emp3 = new Employee(3," Test Analyst ", " Deloitte ", 340.0);
		Employee emp4 = new Employee(4," Java Developer ", " Google ", 300.0);
		Employee emp5 = new Employee(5," Test Automation ", " IBM ", 400.0);
		Employee emp6 = new Employee(6," Senior Test Analyst ", " Yahoo ", 50.0);
		emap.put(1,emp1);
		emap.put(2,emp2);
		emap.put(3,emp3);
		emap.put(4,emp4);
		emap.put(5,emp5);
		emap.put(6,emp6);
		Collection cl = emap.values();
		Iterator itr = cl.iterator();

		//		System.out.println() result
		while(itr.hasNext()){
		    Employee e = (Employee) itr.next();
			System.out.println(e.getEmpId()+ "\t" + e.getJobTitle()+ "\t" + e.getCompanyName() + "\t" + e.getSalary());
		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
        double arrayList[]={emp1.getSalary(),emp2.getSalary(),emp3.getSalary(),emp4.getSalary(),emp5.getSalary(),emp6.getSalary()};

		//		System.out.println() result

        System.out.println("\n \n *********************************************************** \n \n");
        System.out.println(" \n Final Result " + Arrays.toString(BB(arrayList)));



		//TODO 3 create instance of the Person ->
            Person p = new Person();

		// than make them Student
		Student s = new Student();

		// than make them Employee
		Employee e = new Employee(1,"Test Analyst", "Accenture", 100.0);


		//		System.out.println() result
        System.out.println("\n \n *********************************************************** \n \n");
		System.out.println("My Name Is " + p.firstName + " " + p.secondName + "\n My Age Is " + p.age );
        System.out.println("\n \n *********************************************************** \n \n");
		System.out.println(" My Name Is " + s.name + "\n" + " My Student ID is " + s.studentId + "\n" + " My age is " + s.age + "\n" + " I'm studying in " + s.uni);
        System.out.println("\n \n *********************************************************** \n \n");
		System.out.println(" My Employee ID is " + e.empId + "\n" + " My Job Title is " + e.jobTitle + "\n" +
				" I work in company " + e.companyName +"\n" + " My Salary is " + e.salary);

		//TODO 4 Create method for total change employee information
		// for example some employee change his work
        while (e.jobTitle.equals( "Test Analyst")){
            e.salary = 700.0;
            e.jobTitle = "DevOPs";
            e.companyName = "LV";
            e.empId = 108;
            System.out.println("\n \n *********************************************************** \n \n");
            System.out.println(" The new Employee details are " +  "\n");
            System.out.println(" My Employee ID is " + e.empId + "\n" + " My Job Title is " + e.jobTitle + "\n" +
                    " I work in company " + e.companyName +"\n" + " My Salary is " + e.salary);
        }


	}

    public static double[] BB(double[] arr){
        double temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("Iteration" + (i + 1) + " Result:  " + Arrays.toString(arr));
        }
        return arr;
    }



}
