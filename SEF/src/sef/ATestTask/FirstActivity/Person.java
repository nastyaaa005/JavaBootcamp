package sef.ATestTask.FirstActivity;


public class Person {
	String firstName;
	String secondName;
	int age;

//TODO 1 Implement Person Attributes

	//Behavior - default constructor
	public Person(){
		this.firstName="ivan";
		this.secondName = "ron";
		this.age = 32;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;

	}
	public String announce(){
		return "my name is " +firstName  +secondName+ "and my age is "+age;
	}

	public void setName(String sam) {
	}
}

