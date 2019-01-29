package com.flores.daggerdi.di.component;

import android.app.Application;

import com.flores.daggerdi.di.module.ActivityModule;
import com.flores.daggerdi.di.module.AppModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityModule.class,
        AppModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}
