package com.flores.daggerdi;

public class Teacher {
    String subject;
    String name;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
