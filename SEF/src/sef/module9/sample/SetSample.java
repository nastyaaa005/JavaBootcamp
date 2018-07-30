package sef.module9.sample;
//Needs to be completed
import java.util.*;

public class SetSample {
	public static void main(String[] args) {
		//1 - Create a new HashSet and name it monthSet
		/*
		Set monthSet = new HashSet();
		System.out.println(monthSet.add("Jan"));
		System.out.println(monthSet.add("Feb"));
		System.out.println(monthSet.add("Jan"));

		//2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false
		//System.out.println(monthSet.add("January"));
		for (Object o : monthSet) {
			System.out.println(o);
		}*/
		//3 - Iterate through the HashSet and print all the months.
		
		//You'd notice that duplicate names are not printed.

		SortedSet set2 = new TreeSet();
		set2.add("Jan");
		set2.add("Feb");
		set2.add("Jan");
		set2.add("Aan");

		for (Object o : set2) {
			System.out.println(o);
		}
	}
}
