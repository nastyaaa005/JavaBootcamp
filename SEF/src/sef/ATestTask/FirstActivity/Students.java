package sef.ATestTask.FirstActivity;

public class Students extends Person {
    private String schoolName;

    public Students()
    {
        this.schoolName = "Unknown";
    }

    public Students(String SchoolName)
    {
        this.schoolName = SchoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String announce() {
        return "I am study in university "+getSchoolName();
    }
}
