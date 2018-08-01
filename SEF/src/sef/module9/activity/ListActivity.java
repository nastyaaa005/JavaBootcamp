package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		List list= new ArrayList<>();
		list.add("Krieger");
		list.add("Mallory");
		list.add("Archer");
		//1 - Type code to create a list of names. Use ArrayList.
		ListActivity la= new ListActivity();
		la.print(list);
		//2 - Call print method to print the list passed as its parameter.
	}
	
	void print(List list)
	{
		for(Object o:list){ System.out.println(o);} // ja arraylist string tad var string
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
	
	}
}
