package com.flores.daggerdi.di.module;

import com.flores.daggerdi.ClassroomActivity;
import com.flores.daggerdi.SchoolActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ClassroomModule {

    @ContributesAndroidInjector(modules = TeacherModule.class)
    abstract ClassroomActivity classroomActivity();

    @ContributesAndroidInjector(modules = StudentsModule.class)
    abstract SchoolActivity schoolActivity();

}
