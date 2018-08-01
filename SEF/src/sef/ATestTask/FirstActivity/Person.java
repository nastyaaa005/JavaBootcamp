package sef.ATestTask.FirstActivity;


import com.sun.org.apache.xpath.internal.operations.Bool;

public class Person {
	private int age;
	private String secondName;
	private String firstName;


//TODO 1 Implement Person Attributes

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){

		//Task for 1.5 point - when set firstName and secondName, check no numbers there. ->
		try {
			if (checkNameOnNumbers(firstName))
				this.firstName = firstName;
			else
				this.firstName = "Unknown";

			if (checkNameOnNumbers(secondName))
				this.secondName = secondName;
			else
				this.secondName = "Unknown";
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		try {
			this.firstName = firstName;
		}catch(Exception e){
			System.out.println(e.getMessage());
			this.firstName="Unknown";
		}
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
		try {
			this.secondName = secondName;
		}catch (Exception e){
			System.out.println(e.getMessage());
			this.secondName="Unknown";
		}
	}

//	 1.2 Add method for introduce of person ->
//			"My name is <name> and i am <age> years old"
	public String introduceMyself(){
		return "My name is " + getFirstName() + " " + getSecondName() +  " and I am " + getAge() + " years old.";
	}

	public boolean checkNameOnNumbers(String name) throws ExceptionNameContainsNotLetters {

		if (name != null && name.matches("[a-zA-Z]+")) {
			return true;
		}
		else{
			throw new ExceptionNameContainsNotLetters();
		}
	}
}

