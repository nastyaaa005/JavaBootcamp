package sef.module9.activity;
//Needs to be completed

import sef.module6.sample.Person_P;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map map = new HashMap();
			Person_P p1 = new Person_P("John", 12);
			Person_P p2 = new Person_P("Kate", 22);
			Person_P p3 = new Person_P("Van", 42);
			Person_P p4 = new Person_P("Sonya", 24);

			map.put(1, "John");
			map.put(3, "Peter");
			map.put(4, "Mary");
			map.put(2, "Peter");
			map.put(5, p1);
			map.put(6, p2);
			map.put(7, p3);
			map.put(8, p4);

			//2 - Call print method to print the map passed as its parameter.
			MapActivity ma = new MapActivity();
			ma.print(map);
		
		}
		
		void print(Map map)
		{
			//3 - Type code to print this map
			System.out.println("*************************************");
			System.out.println(map.keySet());
			System.out.println("-------------------------------------");
			Set keySet = map.keySet();
			Iterator it=keySet.iterator();
			while(it.hasNext())
			{
				int key= (int)it.next();
				System.out.println(key+"\t"+map.get(key));
			}

			System.out.println("*************************************");

			//Shorter variant
			for (Object o : map.keySet()){
				System.out.println(o +"\t"+map.get(o));

			}
		
		}
	}
