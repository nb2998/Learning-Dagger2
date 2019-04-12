package com.apps.nb2998.learningDagger2.dagger;

import com.apps.nb2998.learningDagger2.MainActivity;
import com.apps.nb2998.learningDagger2.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class}) // can either have PetrolEModule or DieselEModule
public interface CarComponent {
    Car getCar(); // constructor injection

    void inject(MainActivity mainActivity);
}
