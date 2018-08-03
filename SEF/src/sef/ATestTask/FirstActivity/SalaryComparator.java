package sef.ATestTask.FirstActivity;

import java.util.Comparator;

public class SalaryComparator {
    public class SalaryComparator implements Comparator<Employee> {
        public int compare(Employee a1, Employee a2){
            if(a1.getSalary() == a2.getSalary())
                return 0;
            else if(a1.getSalary() > a2.getSalary())
                return 1;
            else
                return -1;
        }
    }
}
