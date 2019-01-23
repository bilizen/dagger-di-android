//package com.flores.daggerdi.app;
//
//import com.flores.daggerdi.di.GeneralComponent;
//
//import dagger.android.AndroidInjector;
//import dagger.android.DaggerApplication;
//
//public class MyApplication extends DaggerApplication {
//    @Override
//    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
//        return null;
//    }
//
//    @Override
//    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
//
//        return DaggerGeneralComponent.builder().application(this).build();
//    }
//}
