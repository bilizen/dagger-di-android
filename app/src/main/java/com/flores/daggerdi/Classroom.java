package com.flores.daggerdi;

import java.util.ArrayList;

public class Classroom {
    Teacher teacher;
    ArrayList<Student> students;

    Classroom(Teacher teacher,ArrayList<Student> students) {

    }

    Teacher getTeacher() {
        return teacher;
    }

    ArrayList<Student> getStudents() {
        return students;
    }

}





