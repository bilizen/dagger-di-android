package com.flores.daggerdi;

public class Teacher {
    String subject;
    String name;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject(){
        return subject;
    }

}
