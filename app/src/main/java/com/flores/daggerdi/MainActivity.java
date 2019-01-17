package com.flores.daggerdi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.flores.daggerdi.di.DaggerGeneralComponent;
import java.util.List;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Group group;

    @Inject
    Teacher teacher;

    @Inject
    List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerGeneralComponent.builder().build().inject(this);


    }
}
