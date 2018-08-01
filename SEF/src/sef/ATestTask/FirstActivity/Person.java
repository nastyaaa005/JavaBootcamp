package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes

    public String firstName;
	public String secondName;
	public int age;

	//Behavior - default constructor
	public Person() {
		this.firstName = "Sara";
		this.secondName = "Smith";
		this.age = 30;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age) {
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

    public static void main(String[] args) {
        Person one = new Person();
        System.out.println("My name is " +  one.firstName + " " + one.secondName + " and I am " + one.age + " years old.");
    }

//	System.out.println("My name is " +  firstName + " " + secondName + "and I am " + age + " years old.");

}

