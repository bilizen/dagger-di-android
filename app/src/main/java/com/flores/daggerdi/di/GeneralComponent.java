package com.flores.daggerdi.di;

import com.flores.daggerdi.MainActivity;
import dagger.Component;

@Component(modules = {MathGroupModule.class})
public interface GeneralComponent {
    void inject(MainActivity mainActivity);
}
