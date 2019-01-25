package com.flores.daggerdi;


import java.util.ArrayList;

import javax.inject.Inject;

public class Student {

    String name;
    String lastName;

    @Inject
    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }


    String getNameAndLastName() {
        return name + " " + lastName;
    }

}
