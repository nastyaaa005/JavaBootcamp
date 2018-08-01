package sef.module4.sample;

import java.util.Calendar;

public class Person {

	//Attributes
	private String name;
	private int age;
	//Behavior
	public Person(String name){
		this.name = name;
	}
	public Person(){};
	public Person(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getAge(){return age;}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age){this.age=age;}
	public String introduce(){
		return "My name is " + name;
	}
	public String hello(){
		return "My name is " + name +"\nMy age is "+ age;
	}
	
}
