package com.flores.daggerdi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.flores.daggerdi.di.component.DaggerAppComponent;
import javax.inject.Inject;

public class ClassroomActivity extends AppCompatActivity {

    @Inject
    Classroom classroom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerAppComponent.create().inject(this);

        Log.e("lisatas", classroom.toString());

    }
}
