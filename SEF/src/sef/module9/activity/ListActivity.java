package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {


	public static void main(String[] args) {
		List <String> names = new ArrayList<>();

		names.add("Anna");//1 - Type code to create a list of names. Use ArrayList.
		names.add("John");
		names.add("Maggie");

		print(names);
	}
	
	static void print(List <String> list)

