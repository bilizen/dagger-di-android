package com.flores.daggerdi.di.module;

import com.flores.daggerdi.School;
import com.flores.daggerdi.SchoolActivity;
import com.flores.daggerdi.di.scope.SchoolActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class SchoolModule {

    private SchoolActivity schoolActivity;

    public SchoolModule(SchoolActivity schoolActivity) {
        this.schoolActivity = schoolActivity;
    }

    @Provides
    @SchoolActivityScope
    School school(){
        return new School();
    }


}
