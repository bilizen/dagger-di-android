package com.flores.daggerdi.di.component;

import android.app.Application;

import com.flores.daggerdi.ClassroomActivity;
import com.flores.daggerdi.di.module.AppModule;
import com.flores.daggerdi.di.module.ClassroomModule;
import com.flores.daggerdi.di.module.SchoolModule;
import com.flores.daggerdi.di.module.StudentsModule;
import com.flores.daggerdi.di.module.TeacherModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;

@Component(modules = {
        AppModule.class,
        ClassroomModule.class,
        StudentsModule.class,
        TeacherModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }


    SchoolComponent schoolComponent(SchoolModule schoolModule);

    void inject(ClassroomActivity classroomActivity);

}
