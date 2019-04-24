package com.apps.nb2998.learningDagger2.dagger;

import com.apps.nb2998.learningDagger2.car.DieselEngine;
import com.apps.nb2998.learningDagger2.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

//@Module
//public class PetrolEngineModule {
//
//    @Provides
//    Engine provideEngine(PetrolEngine petrolEngine) {
//        return petrolEngine;
//    }
//    // however this method is redundant, efficient way to use with interfaces is @Binds
//    // as dagger optimises the work under the hood more than provides / even static provides
//    // This is because dagger never creates an implementation for this method
//    // therefore, to bind an implementation to an interface: use @Binds instead of @Provides
//    // delete the function body, turn it to abstract method (hence, abstract class)
//}

//@Module
//public abstract class DieselEngineModule {
//
//    @Binds
//    abstract Engine bindEngine(DieselEngine engine);
//    // takes a single argument which is an implementation for the interface defined as return type
//
//    // Also, since this is an abstract class, @Provides can't be used as provide methods need an instance of Module class which is not possible
//    // instead static provide methods can be used
//}

// Part 7- injecting values at runtime

@Module
public class DieselEngineModule {

    private int horsepower;

    public DieselEngineModule(int horsepower) {
        this.horsepower = horsepower;
    }

    // can't use binds now as it doesnt't support config ; back to provides
    // and can't make method static as it depends on instance variable

    @Provides
    Engine providesEngine() {
        return new DieselEngine(horsepower);
    }

}
