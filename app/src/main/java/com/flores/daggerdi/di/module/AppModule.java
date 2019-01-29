package com.flores.daggerdi.di.module;

import com.flores.daggerdi.School;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    School school(){
        return new School();
    }

}
