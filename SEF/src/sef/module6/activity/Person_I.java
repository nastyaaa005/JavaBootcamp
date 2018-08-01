package sef.module6.activity;

/* Person_I class is the superclass 
 * Attributes : name, age
 */
	public class Person_I {
	private String name;
	private int age;

	 Person_I(){System.out.println("I am Person constructor!");}

	public Person_I(String Name,int Age){
		this.age=Age;
		this.name=Name;
		System.out.println("I am Person constructor!");
	};


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//Attributes

	//Behavior - write default constructor. Print 'I'm Person_I constructor'
	
	
	//Behavior - write parameterized constructor
	
	
	// write getter for String name
	
	
	// write setter for String name
	

	// write getter for int age
	

	// write setter for int age
	
}

