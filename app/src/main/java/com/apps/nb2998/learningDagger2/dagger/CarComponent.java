package com.apps.nb2998.learningDagger2.dagger;

import com.apps.nb2998.learningDagger2.MainActivity;
import com.apps.nb2998.learningDagger2.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
// can either have PetrolEModule or DieselEModule
public interface CarComponent {
    Car getCar(); // constructor injection

    void inject(MainActivity mainActivity);


    //    Part 8: Efficient way of passing variable to Builder
    //    Defining API for our car component builder ourselves
//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder horsepower(int horsepower);
//
//        // mandatory
//        CarComponent build();
//    }

    // Limitations of this: The variable associated is only bound to dagger by it's datatype
    // If the builder is kept same and another variable is added to petrol engine, say engine capacity the same value
    // will be printed in the start() method because dagger cannot differentiate bw the 2 integers

    // Also, if we try adding another method using BindsInstance :
//    @BindsInstance
//    Builder engineCapacity(int engineCapacity);
    // build fails : Integer is bound multiple times

    // To solve this: with the property use @Named("Name") with thr Builder methods and in constructor


    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsepower(@Named("horse power") int horsepower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        // mandatory
        CarComponent build();
    }

}
