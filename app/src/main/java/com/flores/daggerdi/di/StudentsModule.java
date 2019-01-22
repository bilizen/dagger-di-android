package com.flores.daggerdi.di;

import com.flores.daggerdi.Student;

import java.util.ArrayList;
import dagger.Module;
import dagger.Provides;

@Module
public class StudentsModule {

    @Provides
    ArrayList<Student> providesStudents( ArrayList<Student> students) {
        return students;
    }
}
