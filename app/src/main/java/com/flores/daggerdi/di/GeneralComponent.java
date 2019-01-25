package com.flores.daggerdi.di;

import com.flores.daggerdi.Classroom;
import com.flores.daggerdi.Student;
import com.flores.daggerdi.Teacher;
import java.util.ArrayList;
import dagger.Component;

@Component(modules = {
        ClassroomModule.class,
        StudentsModule.class,
        TeacherModule.class})
public interface GeneralComponent {

    Teacher getTeacher();

    ArrayList<Student> getStudents();

    Classroom getClassroom();
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        GeneralComponent.Builder application(Application application);
//
//        GeneralComponent build();
//    }

}
