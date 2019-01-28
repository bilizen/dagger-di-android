package com.flores.daggerdi;

public class Student {

    String name;
    String lastName;


    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    String getNameAndLastName() {
        return name + " " + lastName;
    }

}
