package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person{

   /* Create file students from scratch
  3.2 Add method for introduce of person ->
            "I am study in university <schoolName>" */

   private String schoolName;

   public Student(){
       schoolName="";
   }
   public Student(String school){
       this.schoolName=school;
   }
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String introduce(){

       return super.introduce() + " and I study in university "+schoolName;
    }
}
