package com.apps.nb2998.learningDagger2.dagger;

import com.apps.nb2998.learningDagger2.MainActivity;
import com.apps.nb2998.learningDagger2.car.Car;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
// can either have PetrolEModule or DieselEModule
public interface CarComponent {
    Car getCar(); // constructor injection

    void inject(MainActivity mainActivity);


    //    Part 8: Efficient way of passing variable to Builder
    //    Defining API for our car component builder ourselves
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsepower(int horsepower);

        // mandatory
        CarComponent build();
    }
}
