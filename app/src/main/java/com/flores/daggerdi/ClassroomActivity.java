package com.flores.daggerdi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class ClassroomActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Teacher teacher = new Teacher("Pablo", "Mathematics");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex", "Flores"));
        students.add(new Student("Juan", "Vilchez"));

        Classroom classroom = new Classroom(teacher, students);
        classroom.getTeacher();
        classroom.getStudents();

    }
}
