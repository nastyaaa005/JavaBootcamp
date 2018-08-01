package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {
    private String school;

    public Student() {
        this.school=("Unknow");

    }


    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public String announce() {
        return super.announce()+"My mane is "+ getFirstName()+" " + getSecondName()+
                "I am study in university " + getSchool();
    }

}

