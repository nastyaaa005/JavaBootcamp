package sef.module9.activity;
//Needs to be completed

import sef.module9.sample.ListSample;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List alist = new ArrayList();
		alist.add("a");
		//2 - Call print method to print the list passed as its parameter.
		System.out.println(alist);
		ListActivity obj= new ListActivity();
		obj.print(alist);
	}


	
	void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.

	
	}
}
