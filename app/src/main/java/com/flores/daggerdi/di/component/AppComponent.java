package com.flores.daggerdi.di.component;

import com.flores.daggerdi.ClassroomActivity;
import com.flores.daggerdi.di.module.AppModule;
import com.flores.daggerdi.di.module.ClassroomModule;
import com.flores.daggerdi.di.module.SchoolModule;
import com.flores.daggerdi.di.module.StudentsModule;
import com.flores.daggerdi.di.module.TeacherModule;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AppModule.class,
        ClassroomModule.class,
        StudentsModule.class,
        TeacherModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent {

    SchoolComponent schoolComponent(SchoolModule schoolModule);

    void inject(ClassroomActivity classroomActivity);

}
