package com.flores.daggerdi.di;

import com.flores.daggerdi.Group;
import com.flores.daggerdi.Student;
import com.flores.daggerdi.Teacher;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class MathGroupModule {
    @Provides
    List<Student> providesMathStudents() {
        List<Student> mathStudents = new ArrayList<>();
        Student s1 = new Student("SName 1", "SLastname 1");
        Student s3 = new Student("SName 3", "SLastname 3");
        Student s5 = new Student("SName 5", "SLastname 5");
        mathStudents.add(s1);
        mathStudents.add(s3);
        mathStudents.add(s5);
        return mathStudents;
    }

    @Provides
    Teacher providesMathTeacher() {
        return new Teacher("TName 1", "Maths");
    }

    //use of providers as method parameters
    @Provides
    Group providesMathGroup(Teacher teacher, List<Student> mStudents) {
        return new Group(teacher, mStudents);
    }
}
