package sef.module17.activity;

public class Person_T {

    private int age;
    private String name;
    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int i) {
        this.age=i;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String announce() {

        return "I am "+name+ " and my age is "+age;
    }
}
