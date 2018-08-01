package sef.module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		
		Set<String> names= new TreeSet<>();
		names.add("jhon");
		names.add("thomas");
		names.add("ds");
		names.add("albert");
		names.add("ivan");
		//2 - Call print method to print the set passed as its parameter.
		System.out.println("the names are "+ names);
	}
	
	public static void print(Set set)
	{
		for (Object o : set){
			System.out.println(o);
		}


		//3 - Type code to print this set
		//Notice the order in which elements get printed.
	}
}
