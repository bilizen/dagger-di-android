package com.flores.daggerdi.app;

import dagger.android.AndroidInjector;

public class DaggerAplication extends dagger.android.DaggerApplication {

    @Override
    protected AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {

        return null;
    }
}
