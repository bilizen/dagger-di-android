package com.flores.daggerdi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.flores.daggerdi.di.DaggerGeneralComponent;
import com.flores.daggerdi.di.GeneralComponent;
import java.util.ArrayList;

import javax.inject.Inject;

public class ClassroomActivity extends AppCompatActivity {

    @Inject
    School school;

    @Inject
    Course course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GeneralComponent generalComponent= DaggerGeneralComponent.create();
        Classroom classroom = generalComponent.getClassroom();
        classroom.getStudents();
        classroom.getTeacher();

        course.

    }
}
