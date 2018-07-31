package sef.module17.activity;

public class Person_I {

    //Attributes
    private String name;
    private int age;


    //Getters and Setters

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String announce(){
        return " I am " + name + " and my age " + age;
    }
}
