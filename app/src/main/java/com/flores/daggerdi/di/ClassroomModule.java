package com.flores.daggerdi.di;

import com.flores.daggerdi.Classroom;
import dagger.Module;
import dagger.Provides;

@Module
public class ClassroomModule {

    @Provides
    Classroom providesClassroom() {
        return new Classroom();
    }

}
