package sef.module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		
		Set<String> names = new HashSet();

		names.add("Jhon");
		names.add("Maria");
		names.add("1234");
		names.add("Sam");
		names.add("Maria");
		names.add("Maria");
		names.add("Kostya");
		names.add("Maria");


		//2 - Call print method to print the set passed as its parameter.
		
	}
	
	static void print(Set set)
	{
		for (int i = 0; i < set.size(); i++) {
			System.out.println(set.getClass())
		}
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
	}
}
