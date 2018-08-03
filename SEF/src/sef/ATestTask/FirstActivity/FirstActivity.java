package sef.ATestTask.FirstActivity;

import java.util.*;
import java.io.*;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Google", 1, "Security", 1002.56));
        employeeList.add(new Employee("Apple", 1, "Developer", 1567.98));
        employeeList.add(new Employee("MustDie", 2, "Developer", 1560));
        employeeList.add(new Employee("Google", 2, "Tester", 1333.98));
        employeeList.add(new Employee("Google", 2, "PM", 2001.13));
        employeeList.add(new Employee("Blizzard", 3, "Designer", 1222));


        //TODO 2 sort and this employees by salary (from min to max)
        for (int i = 0; i < employeeList.size() - 1; i++)
            for (int j = 0; j < employeeList.size() - 1; j++)
                if (employeeList.get(j).getSalary() < employeeList.get(j + 1).getSalary())
                    Collections.swap(employeeList, j, j + 1);
        for (int i = 0; i < employeeList.size(); i++)
            System.out.println(employeeList.get(i).announce());

        //TODO: save employees in file

        try{
            new FirstActivity().writeToFile(employeeList);
        }catch (IOException e){
            System.out.println(e);
        }




        //TODO 3 create instance of the Person ->
        Person p = new Person("Aria", "Stark", 16);
        // use announce()
        System.out.println(p.announce());
        //than make them Student
        p = new Students("RTU");
        // use announce()
        System.out.println(p.announce());

        // than make them Employee
        p = new Employee("McDonalds",56775, "Manager",567.98);

        // use announce()

        System.out.println(p.announce());


        //TODO 4 Create method for full change of employee information
        // for example some employee change his work
        //NOTE: done in Employee


    }

    public void writeToFile(List<Employee> employeeList) throws IOException
    {
        FileWriter fileWriter = new FileWriter("EmployeeList.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int j = 0; j < employeeList.size() - 1; j++)
                     printWriter.print(employeeList.get(j).announce()+"\n");
        printWriter.close();

    }





}
