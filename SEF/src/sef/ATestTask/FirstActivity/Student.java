package sef.ATestTask.FirstActivity;


//TODO Implement class Student
//3.1 Create file students from scratch


public class Student extends Person{

        private String schoolName;
        private double averageGradeInYear;
        private String[] coursesTaken;
        private String[] communityActivities;

    public Student(){
        this.schoolName = "Unknown";
        this.averageGradeInYear = 0;
        initializeCoursesAndCommunityActivities();
    }

    public Student(String schoolName, double averageGradeInYear){
        this.schoolName = schoolName;
        this.averageGradeInYear = averageGradeInYear;
        initializeCoursesAndCommunityActivities();
    }

    public Student(String firstName, String secondName, int age, String schoolName, double averageGradeInYear){
        super(firstName, secondName,age);
        this.schoolName = schoolName;
        this.averageGradeInYear = averageGradeInYear;
        initializeCoursesAndCommunityActivities();
    }

    public Student(String firstName, String secondName, int age){
        super(firstName, secondName,age);
        this.schoolName = "Unknown";
        this.averageGradeInYear = 0;
        initializeCoursesAndCommunityActivities();
    }

    public void initializeCoursesAndCommunityActivities(){
        this.coursesTaken = new String[]{"None"};
        this.communityActivities = new String[] {"None"};
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getAverageGradeInYear() {
        return averageGradeInYear;
    }

    public void setAverageGradeInYear(double averageGradeInYear) {
        this.averageGradeInYear = averageGradeInYear;
    }

    public String[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(String[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public String[] getCommunityActivities() {
        return communityActivities;
    }

    public void setCommunityActivities(String[] communityActivities) {
        this.communityActivities = communityActivities;
    }

    //        3.2 Add method for introduce of person ->
    //        "I am study in university <schoolName>"
    @Override
    public String introduceMyself(){
        return super.introduceMyself() +
                "\nI am study in university " + getSchoolName() + ".";
    }
}
