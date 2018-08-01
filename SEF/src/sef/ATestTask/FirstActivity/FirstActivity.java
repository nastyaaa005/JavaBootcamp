package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

    public static void main(String[] args) {


        Person person1 = new Person();
        Student student1 = new Student();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        student1.setGrade(9);
        student1.setSchool("RTU");
        student1.setName("jhon");
        student1.setAge(22);

        employee1.setCompanyName("trcs");
        employee1.setJobTitle("manager");
        employee1.setEmpId(777);
        employee1.setSalary(1123.90);

        employee1.setCompanyName("trcs");
        employee1.setJobTitle("traineer");
        employee1.setEmpId(347);
        employee1.setSalary(433.90);

        employee2.setCompanyName("trcs");
        employee2.setJobTitle("intern");
        employee2.setEmpId(122);
        employee2.setSalary(523.90);

        employee3.setCompanyName("trcs");
        employee3.setJobTitle("intern");
        employee3.setEmpId(423);
        employee3.setSalary(523.90);

        employee4.setCompanyName("trcs");
        employee4.setJobTitle("lead");
        employee4.setEmpId(457);
        employee4.setSalary(723.90);

        employee5.setCompanyName("trcs");
        employee5.setJobTitle("tester");
        employee5.setEmpId(321);
        employee5.setSalary(655);



        List employList = new ArrayList();
        employList.add(employee1);
        employList.add(employee2);
        employList.add(employee3);
        employList.add(employee4);
        employList.add(employee5);

        person1.setName("Sam");

        System.out.println(person1.announce());
        System.out.println(student1.announce());
        System.out.println(employee2.announce());
        System.out.println(employee3.announce());
        System.out.println(employee4.announce());
        System.out.println(employee5.announce());

    }
}
        /*
    public static void bubbleSort(Employee employArray) {
        int i, swap = 0;


        do {
            swap = 0;
            for (i=0; i<employArray ; i++){
                int grade = arrsalary[i].getGrade();
                int gradePlus = arrsalary[i+1].getGrade();
                if (grade>grade+1) {
                    i=grade;
                    grade=gradePlus;
                    gradePlus=i;
                    swap++;
                }
            }
        } while (swap>0);
    }


            }}}}
            */
		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

		//TODO 4 Create method for total change employee information
		// for example some employee change his work




	
	

