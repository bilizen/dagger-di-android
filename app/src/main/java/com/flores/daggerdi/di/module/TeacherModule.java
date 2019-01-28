package com.flores.daggerdi.di.module;

import com.flores.daggerdi.Teacher;
import com.flores.daggerdi.di.component.SchoolComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public class TeacherModule {

    @Provides
    Teacher providesTeacher()
    {
        return new Teacher("Pablo", "Mathematics");
    }



}
