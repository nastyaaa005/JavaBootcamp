package sef.module9.activity;
//Needs to be completed

import java.util.*;


public class MapActivity {

		public static void main(String args[]) {
            //1 - Type code to create a HashMap of key value pair
            //where key is id of type String and value is a name
        Map names=new HashMap();

			names.put(12,"albert");
			names.put(1,"ds");
			names.put(2,"jhon");
			names.put(876,"bell");
		
			
			//2 - Call print method to print the map passed as its parameter.
		System.out.println("the values are  "+names);
		}
		
		public static void print(Map map)
		{
			//3 - Type code to print this map
			System.out.println(map.keySet());


			for (Object o: map.keySet()
                    )
			{
				System.out.println(map.get(o));

			}

			}
		}
	}
