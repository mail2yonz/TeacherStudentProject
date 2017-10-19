package com.company;

import java.util.ArrayList;

public class Teacher extends Person {


    ArrayList<Course> coursesTaught;
    Course course;

    public Teacher()
    {
        course= new Course();
        coursesTaught= new ArrayList<Course> (  );

    }



    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(ArrayList<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }







}
