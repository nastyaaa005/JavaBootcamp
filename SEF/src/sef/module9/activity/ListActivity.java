package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List namesList = new ArrayList<String>();
		namesList.add("Name1");
		namesList.add("Name2");
		namesList.add("Name5");
		namesList.add("Name4");
		namesList.add("Name3");
		namesList.add("Name1");
		
		//2 - Call print method to print the list passed as its parameter.
		namesList.forEach(i -> System.out.println(i));
		System.out.println(namesList.indexOf("Name1"));
		System.out.println(namesList.lastIndexOf("Name1"));
		System.out.println(namesList.indexOf(""));

		Collections.sort(namesList);
		System.out.println(namesList);
	}
	
	void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.

	}
}
