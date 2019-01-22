package com.flores.daggerdi.di;

import com.flores.daggerdi.Teacher;

import dagger.Module;
import dagger.Provides;

@Module
public class TeacherModule {

    @Provides
    Teacher providesTeacher(Teacher teacher)
    {
        return teacher;
    }

}
