package sef.module9.activity;
//Needs to be completed

import sef.module6.sample.Person_P;
import sef.module6.sample.Student_P;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name

			Map names = new HashMap();


			Person_P p = new Person_P("Jhon", 12);
			Person_P p2 = new Person_P("Kostya", 22);
			Person_P p3 = new Person_P("Ivan", 32);

			Person_P s1= new Student_P();
			s1.setAge(35);
			s1.setName("Student1");

			names.put("Person1", p);
			names.put("Person2", p2);
			names.put("Person3", p3);
			names.put("Student1", s1);





			//2 - Call print method to print the map passed as its parameter.
			print(names);
		}
		
		static void print(Map<String, Person_P> map)
		{
			//3 - Type code to print this map
			System.out.println(map.keySet());

			for (Object o: map.keySet()) {
				System.out.println(map.get(o));
			}

		}
	}
