package sef.module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;

public class SetActivity {

	public static void main(String[] args) {

		SortedSet h = new TreeSet(); // alfabeta seciba
		h.add("Ray");
		h.add("Charleene");
		h.add("Baboo");
		h.add("Berry");
		h.add("Berry"); // wont add

		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		print(h);
		//2 - Call print method to print the set passed as its parameter.
	}
	
	static void print(Set set)
	{
		Iterator<String> i = set.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}
