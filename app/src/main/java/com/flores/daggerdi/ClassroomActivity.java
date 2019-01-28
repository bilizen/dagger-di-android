package com.flores.daggerdi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import javax.inject.Inject;
import dagger.android.support.DaggerAppCompatActivity;

public class ClassroomActivity extends DaggerAppCompatActivity {

    @Inject
    Teacher teacher;

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teacher.getName();

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
