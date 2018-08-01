package sef.module17.activity;

public class person_T {
    private String name;
    private  int age;


    public void setName(String name) {
      this.name=name;
    }

    public String getName(String name) {
       return  name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String announce(){

        return "my name is "+name+ " and my age is "+age;
    }
}
