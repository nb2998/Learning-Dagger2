package com.apps.nb2998.learningDagger2;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {
    Car getCar(); // constructor injection

    void inject(MainActivity mainActivity);
}
