package sef.module4.sample;

import java.util.Calendar;

public class Person {

	//Attributes
	private String name;
	private String gree;

	
	
	//Behavior
	public Person(String name){
		this.name = name;
	}
	public Person(String gender){
		this.gen = gender;
	}
	public String getName() {
		return name;
	}
	public String getGree() { return gen; }

	public void setName(String name) {
		this.name = name;
	}
	public void setGree(String gender) {this.gen = gender ;}

	public String introduce(){
		return "My name is " + name;
	}
	
}
