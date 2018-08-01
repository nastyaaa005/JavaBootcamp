package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List <String> names= new ArrayList<>();
		names.add("mike");
		names.add("sam");

		//2 - Call print method to print the list passed as its parameter.
		System.out.println(""+names);
	}

	private void add() {
	}

	void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
	System.out.println("" +list);
	}
}
