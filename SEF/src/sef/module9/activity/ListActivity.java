package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.

		List <String> names = new ArrayList<>();

		names.add("Jhon");
		names.add("Maria");
		names.add("1234");
		names.add("Sam");
		names.add("Kostya");

		
		//2 - Call print method to print the list passed as its parameter.
		
	}
	
	static void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.

		for (String s : List) {
			System.out.println(s);
		}
	}
}
