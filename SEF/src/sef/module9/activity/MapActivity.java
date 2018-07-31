package sef.module9.activity;
//Needs to be completed

import sef.module9.sample.MapSample;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map map = new HashMap();
			map.put("1", "A String");
			map.put("2", new Date());
			map.put("3", new Integer(42));
			map.put("4", new Float(23.0f));

			//2 - Call print method to print the map passed as its parameter.
			System.out.println(map.get("1"));
			System.out.println(map.get("2"));

		}
		
		static void print(Map map)
		{
			//3 - Type code to print this map
		
		}
	}
