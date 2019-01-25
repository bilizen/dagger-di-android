package com.flores.daggerdi;

import javax.inject.Inject;

public class Teacher {
    String subject;
    String name;

    @Inject
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name + " " + subject;
    }

}
