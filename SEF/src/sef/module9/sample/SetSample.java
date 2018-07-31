package sef.module9.sample;
//Needs to be completed
import java.util.*;

public class SetSample {
	public static void main(String[] args) {
		//1 - Create a new HashSet and name it monthSet
		Set monthSet = new HashSet();

		//2 - Add duplicate month names in it. For eg. January can be entered twice
		System.out.println(monthSet.add("January"));
		System.out.println(monthSet.add("February"));
		System.out.println(monthSet.add("March"));
		System.out.println(monthSet.add("January"));
		//duplicates will return false
		//System.out.println(monthSet.add("January"));

		System.out.println("Output : ");
		//3 - Iterate through the HashSet and print all the months.
		for (Object o : monthSet){
			System.out.println(o);
		}
		//You'd notice that duplicate names are not printed.

		System.out.println("-----------------------------");

		SortedSet set2 = new TreeSet<>();
		System.out.println(set2.add("January"));
		System.out.println(set2.add("February"));
		System.out.println(set2.add("March"));
		System.out.println(set2.add("January"));

		System.out.println("Output : ");
		//3 - Iterate through the HashSet and print all the months.
		for (Object o : set2){
			System.out.println(o);
		}


		System.out.println("-----------------------------");


		{
		};
	}
}
