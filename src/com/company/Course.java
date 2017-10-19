package com.company;

public class Course {

    private String courseID;
    private String courseName;
    private String creaditHour;

    Person person;

    public Course()
    {
        person= new Person();



        System.out.println ("Taking Course" );
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCreaditHour() {
        return creaditHour;
    }

    public void setCreaditHour(String creaditHour) {
        this.creaditHour = creaditHour;
    }


}
