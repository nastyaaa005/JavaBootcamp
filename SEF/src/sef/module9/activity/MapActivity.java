package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;


public class MapActivity {

		public static void main(String[] args) {
			Map names = new HashMap();
			names.put("name1", "John");
			names.put("name2", "Jack");
			names.put("name3", "Tom");
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			
		
			
			//2 - Call print method to print the map passed as its parameter.
		
		}
		
		static void print(Map map)
		{
			//3 - Type code to print this map
		System.out.println(map.keySet());
		for (Object o: map.keySet()) {
			map.get(o).announce();
		}
		}
	}
