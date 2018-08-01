package sef.module9.activity;
//Needs to be completed

import sef.module6.sample.Person_P;

import java.util.HashMap;
import java.util.Map;


public class MapActivity {

		public static void main(String[] args) {
			Map names = new HashMap();
			names.put("name1", "John");
			names.put("name2", "op");
			names.put("name3", "Jo");

			Person_P p= new Person_P("John",12);

			print(names);
		}
		static void print(Map<String, Person_P> map){
			System.out.println(map.keySet());
		for (Object o: map.keySet()) {
			map.get(o).announce();
			System.out.println(map.get(o).getName());
		}
		}
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			
		
			
			//2 - Call print method to print the map passed as its parameter.
	}
