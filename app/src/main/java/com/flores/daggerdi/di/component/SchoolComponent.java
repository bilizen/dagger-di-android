package com.flores.daggerdi.di.component;
import com.flores.daggerdi.SchoolActivity;
import com.flores.daggerdi.di.module.CourseModule;
import com.flores.daggerdi.di.module.SchoolModule;
import com.flores.daggerdi.di.scope.SchoolActivityScope;

import dagger.Subcomponent;

@SchoolActivityScope
@Subcomponent(modules= SchoolModule.class)
public interface
SchoolComponent {

    void inject(SchoolActivity schoolActivity);

}
