package com.flores.daggerdi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.flores.daggerdi.di.DaggerGeneralComponent;
import com.flores.daggerdi.di.GeneralComponent;
import java.util.ArrayList;

import javax.inject.Inject;

public class ClassroomActivity extends AppCompatActivity {



    @Inject
    Teacher teacher;

    @Inject
    Student student;

    @Inject
    Classroom classroom;

    @Inject
    ArrayList<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerGeneralComponent.create().inject(this);

        student.getNameAndLastName();
        Log.e("lisatas",classroom.toString());
//        student.providesStudents();
//        DaggerGeneralComponent.create().providesStudents();

    }
}
