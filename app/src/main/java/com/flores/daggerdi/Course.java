package com.flores.daggerdi;

import javax.inject.Inject;

public class Course {

    String name;

    @Inject
    public Course() {
        name="algebra";
    }

    public String getCourse(){
        return name;
    }
}
