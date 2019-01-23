package com.flores.daggerdi;

import java.util.ArrayList;

import javax.inject.Inject;

public class Classroom {
    Teacher teacher;
    ArrayList<Student> students;


    public Classroom(Teacher teacher, ArrayList<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    Teacher getTeacher() {
        System.out.println(teacher.name + " " + teacher.subject);
        return teacher;
    }

    ArrayList<Student> getStudents() {
        for (Student student : students) {
            System.out.println(student.name + " " + student.lastName);
        }
        return students;
    }

}





