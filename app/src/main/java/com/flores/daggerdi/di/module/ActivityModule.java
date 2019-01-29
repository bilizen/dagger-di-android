package com.flores.daggerdi.di.module;

import com.flores.daggerdi.MainActivity;
import com.flores.daggerdi.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector(modules = TeacherModule.class)
    abstract MainActivity classroomActivity();

    @ContributesAndroidInjector(modules = StudentsModule.class)
    abstract SecondActivity secondActivity();

}
