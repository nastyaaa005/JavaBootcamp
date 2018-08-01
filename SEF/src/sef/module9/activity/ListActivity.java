package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List testlist = new ArrayList();
		for (int i = 0; i <= 20; i++) {
			testlist.add(i);
		}


		//2 - Call print method to print the list passed as its parameter.
		System.out.println(testlist);
	}
	
	void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
	
	}
}
