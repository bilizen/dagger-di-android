package com.flores.daggerdi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import javax.inject.Inject;
import dagger.android.support.DaggerAppCompatActivity;

public class ClassroomActivity extends DaggerAppCompatActivity {

    @Inject
    Teacher teacher;

    @Inject
    Teacher teacher1;

    @Inject
    School school;

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teacher.getName();
        teacher1.getSubject();
        Log.i("teacher:",String.valueOf(teacher.hashCode()));
        Log.i("teacher:",String.valueOf(teacher1.hashCode()));
        school.ingresoClase();
        btnNext=findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), SchoolActivity.class);
                startActivity(intent);
            }
        });
    }
}
