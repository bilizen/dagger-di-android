package com.flores.daggerdi.di;

import com.flores.daggerdi.Student;
import com.flores.daggerdi.Teacher;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

@Module
public class TeacherModule {

    @Provides
    Teacher providesTeacher()
    {
        return new Teacher("Pablo", "Mathematics");
    }

}
