package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes

	//Attributes
	private String firstName, secondName;
	private int age;

	// Person's default constructor
	public Person() {
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	// Person's parameterized constructor
	public Person(String firstName, String secondName, int age) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter/setter for String firstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// getter/setter for String secondName
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	// getter/setter for int age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// Person's introduction method
	public void announce() {
		System.out.println("\nMy name is " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old");
	}

}

