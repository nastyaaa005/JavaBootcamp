package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name

			Map map1 = new HashMap<String,String>();
			map1.put("1", "A String");
			map1.put("2", "A String");
			map1.put(" ", "A String");
			map1.put("a", "A String");
			map1.put("b", "A String");
			map1.put("A", "A String");
			
			//2 - Call print method to print the map passed as its parameter.

			//new MapSample().print(map1);
			map1.forEach((k,v) -> System.out.println("Key: " + k + "\tValue: " + v));
		}
		
		void print(Map map)
		{
			//3 - Type code to print this map
		
		}
	}
