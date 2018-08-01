package sef.ATestTask.FirstActivity;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)


		List <Employee>list= new ArrayList<Employee>();

		Employee firstE= new Employee("John","Doe",30,1,"Manager","Rimi",1000.5);
		Employee secondE= new Employee("Jane","Doe",30,2,"Teacher","RTU",2000);
		Employee thirdE= new Employee("Malory","Archer",40,3,"Sales person","Coffee Inn",500);
		Employee fourthE= new Employee("Jullia","Mao",35,4,"Reporter","Tvnet",521.2);
		Employee fifthE= new Employee("John","Snow",32,5,"Programmer","DZC",900);
		Employee sixthE= new Employee(6,"Graphics Designer","Accenture",1987);

		sixthE.setAge(39);
		try {
			sixthE.setFirstName("Frodo");
		}catch (IllegalArgumentException e) {
		}

		try {
			sixthE.setSecondName("Baggins");
		}catch (IllegalArgumentException e) {
		}


		list.add(firstE);
		list.add(secondE);
		list.add(thirdE);
		list.add(fourthE);
		list.add(fifthE);
		list.add(sixthE);
		print(list);

		try {
			tofile(list);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort

		Employee temp= new Employee();
		for(int i = list.size()-1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if(list.get(j).getSalary() <list.get(j + 1).getSalary()) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		System.out.println("\n \n***Sorted list by Salary: ***");
		print(list);


		System.out.println("\nPersons");
		//TODO 3 create instance of the Person ->
//this task was not possible

		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}

public static void tofile(List <Employee> list) throws IOException {
		int size=list.size();
	BufferedWriter writer = new BufferedWriter( new FileWriter( "liste.txt"));
	for(int n=0; n<size;n++) {
		writer.write(list.get(n).toFile());
	}
	writer.close();
}

public static void print(List <Employee> list){

	for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i).getEmpId() +" "+list.get(i).getFirstName() +" "+list.get(i).getSecondName()+" "+
				list.get(i).getJobTitle()+" at "+list.get(i).getCompanyName() + " salary: "+list.get(i).getSalary());
	}
}

}
