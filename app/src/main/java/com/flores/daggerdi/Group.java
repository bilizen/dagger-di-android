package com.flores.daggerdi;

import java.util.List;

public class Group {
    Teacher teacher;
    List<Student> students;
    public Group(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }
}
