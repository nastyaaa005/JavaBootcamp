package sef.module17.activity;

public class Person_t {

    //Atrr
    private String name;
    private int age;

    //Get Set
    public void setName(String s) {
      name = s;
    }

    public void setAge(int i) {
        age =  i;
    }



    //methods
    public void announce() {
        System.out.println("i am " + name);
    }
}
