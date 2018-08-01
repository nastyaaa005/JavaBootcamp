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



			Person_P p = new Person_P();
		Map hmap= new HashMap();
			hmap.put("1", "Berry");
			hmap.put("3", "Lana");
			hmap.put("2", "Cheryl");
			hmap.put("-1", "Archer");
			hmap.put("0", "Ray");
			hmap.put("-2", "Pam");
			hmap.put("-10", "Malory");
			hmap.put("a", "Katya");
			print(hmap);

			//2 - Call print method to print the map passed as its parameter.
		
		}
		
		static void print(Map map)
		{

			//Keys are maintained as set in map.
			Set keySet = map.keySet();

			System.out.println("KeySet="+keySet);
			Iterator it=keySet.iterator();
			while(it.hasNext())
			{
				String key=(String)it.next();
				System.out.println(key+"\t"+map.get(key));
			}

		}
	}
