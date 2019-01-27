package com.flores.daggerdi;

import javax.inject.Inject;

public class Course {

    String name;

    Course() {
        name="algebra";
    }

    public String getCourse(){
        return name;
    }
}
