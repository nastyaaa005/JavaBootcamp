package sef.module6.activity;

import sef.module4.sample.Person;

/* Person_I class is the superclass
 * Attributes : name, age
 */
public class Person_I {

	//Attributes
	private String name;
	private int age;
	
	//Behavior - write default constructor. Print 'I'm Person_I constructor'
	public Person_I() {
		this.name="Greeshma Amidyala";
		this.age=21;
		System.out.println("I'm Person_I constructor");
	}
	
	//Behavior - write parameterized constructor
	public Person_I(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// write getter for String name
	public String getname() {
		return name ;
	}
	
	// write setter for String name
	public void setName(String name) {
		this.name = name;
	}
	

	// write getter for int age
	public int getage() { return age ; }

	// write setter for int age
	public void setAge(int age){this.age = age ;}

	public void announce(){
		System.out.println("Inside Person Class");
	}
}

