package com.flores.daggerdi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import javax.inject.Inject;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    School school;

    @Inject
    Teacher teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teacher.getName();
        school.ingresoClase();

    }
}
