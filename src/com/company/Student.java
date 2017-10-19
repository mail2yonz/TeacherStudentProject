package com.company;

import java.util.ArrayList;

public class Student extends Person{


    ArrayList<Course> coursesTaken;
    Course course;

    public Student()
    {
        course=new Course();
        coursesTaken = new ArrayList< Course>();
    }

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(ArrayList<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }


}
