package com.flores.daggerdi.di.module;

import android.app.Application;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    Application provideContext(){
        return application;
    }


}
