package com.flores.daggerdi.di;

import com.flores.daggerdi.ClassroomActivity;
import dagger.Component;

@Component(modules = {ClassroomModule.class,
        StudentsModule.class,
        TeacherModule.class})
public interface GeneralComponent {

    void inject(ClassroomActivity classroomActivity);

}
