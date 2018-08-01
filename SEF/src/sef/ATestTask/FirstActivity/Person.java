package sef.ATestTask.FirstActivity;


public class Person {

	public String firstName;
	public String secondName;
	public int age;


//TODO 1 Implement Person Attributes

	//Behavior - default constructor
	public Person() {

	}

	//Behavior - parameterized constructor
	public Person(String firstname, String secondname, int age)
	{
		this.firstName = firstname;
		this.secondName = secondname;
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




public void introduce () {
	System.out.println("My name is " + firstName + secondName + " and my age is " + age);


}}



