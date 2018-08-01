package sef.module17.activity;

public class Person_T {

    private String name;
    private int age;

    public void setName(String John) {
        this.name=John;
    }

    public void setAge(int i) {
        this.age= i;
    }

    protected String announce() {
        return "I am " + getName()+ " My age "+ getAge();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

