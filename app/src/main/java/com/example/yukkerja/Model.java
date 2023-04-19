package com.example.yukkerja;

public class Model {

    // variables for our course
    // name and description.
    private String courseName;
    private String courseimg;
    private String courseMode;

    // creating constructor for our variables.
    public Model(String courseName, String courseimg, String courseMode) {
        this.courseName = courseName;
        this.courseimg = courseimg;
        this.courseMode = courseMode;
    }

    // creating getter and setter methods.
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseimg() {
        return courseimg;
    }

    public void setCourseimg(String courseimg) {
        this.courseimg = courseimg;
    }

    public String getCourseMode() {
        return courseMode;
    }

    public void setCourseMode(String courseMode) {
        this.courseMode = courseMode;
    }


}


