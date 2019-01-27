package com.flores.daggerdi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.flores.daggerdi.di.DaggerGeneralComponent;
import java.util.ArrayList;

import javax.inject.Inject;

public class ClassroomActivity extends AppCompatActivity {


    @Inject
    Classroom classroom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerGeneralComponent.create().inject(this);

        Log.e("lisatas",classroom.toString());

    }
}
