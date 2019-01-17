package com.flores.daggerdi.app;

import android.app.Application;

import com.flores.daggerdi.di.DaggerGeneralComponent;

public class daggerAplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DaggerGeneralComponent.builder().build();
    }
}
