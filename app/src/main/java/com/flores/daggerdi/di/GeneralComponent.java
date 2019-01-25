package com.flores.daggerdi.di;

import android.content.Context;

import com.flores.daggerdi.Classroom;
import com.flores.daggerdi.ClassroomActivity;
import com.flores.daggerdi.Student;
import com.flores.daggerdi.Teacher;
import java.util.ArrayList;
import dagger.Component;

@Component(modules = {ClassroomModule.class,
        StudentsModule.class,
        TeacherModule.class})
public interface GeneralComponent {

    void inject(ClassroomActivity classroomActivity);

//    ArrayList<Student> providesStudents();


//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        GeneralComponent.Builder application(Application application);
//
//        GeneralComponent build();
//    }

}
