package sef.module17.activity;

public class Person_T {


    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String announce() {
        return "My name is " + getName() + " and I am " + getAge() + " years old.";
    }
}
