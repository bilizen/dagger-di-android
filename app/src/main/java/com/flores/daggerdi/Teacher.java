package com.flores.daggerdi;

import javax.inject.Inject;

public class Teacher {
    String subject;
    String name;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return name + " " + subject;
    }

}
