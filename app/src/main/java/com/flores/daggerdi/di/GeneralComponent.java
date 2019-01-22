package com.flores.daggerdi.di;

import android.app.Application;

import com.flores.daggerdi.app.MyApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

@Component(modules = {
        ClassroomModule.class,
        StudentsModule.class,
        TeacherModule.class})
public interface GeneralComponent extends AndroidInjector<DaggerApplication> {


    @Component.Builder
    interface Builder {
        @BindsInstance
        GeneralComponent.Builder application(Application application);

        GeneralComponent build();
    }

}
