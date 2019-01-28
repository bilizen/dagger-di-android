package com.flores.daggerdi.di.module;

import com.flores.daggerdi.Classroom;
import com.flores.daggerdi.Student;
import com.flores.daggerdi.Teacher;
import java.util.ArrayList;
import dagger.Module;
import dagger.Provides;

@Module
public class ClassroomModule {

    @Provides
    Classroom providesClassroom(Teacher teacher, ArrayList<Student> students) {
        return new Classroom(teacher,students);
    }

}
