package sef.module17.activity;

public class Person_T {
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String announce() {
        return "I am " + getName() + " and my age is " + getAge();

    }
}
