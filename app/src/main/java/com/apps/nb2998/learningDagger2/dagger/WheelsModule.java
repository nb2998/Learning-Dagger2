package com.apps.nb2998.learningDagger2.dagger;

import com.apps.nb2998.learningDagger2.car.Rims;
import com.apps.nb2998.learningDagger2.car.Tyres;
import com.apps.nb2998.learningDagger2.car.Wheels;

import dagger.Module;
import dagger.Provides;

//@Module  // contribute to object graph via methods
//public class WheelsModule {
//
//    @Provides
//    // should be made static when possible, like not possible when instance variable in the module .. static means doesn't depend on instance state of the module
//    static Rims provideRims() {
//        return new Rims();
//    }
//
//    @Provides
//    static Tyres provideTyres() {  // static improves performance as dagger doesn't have to instantiate the module class
//        Tyres tyre = new Tyres();
//        tyre.inflate();
//        return tyre;
//    }
//
//    @Provides
//    static Wheels provideWheels(Rims rim, Tyres tyre) {
//        return new Wheels(rim, tyre);
//    }
//}

// Part 7- injecting variables at runtime
@Module  // contribute to object graph via methods
public abstract class WheelsModule {

    @Provides
    // should be made static when possible, like not possible when instance variable in the module .. static means doesn't depend on instance state of the module
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tyres provideTyres() {  // static improves performance as dagger doesn't have to instantiate the module class
        Tyres tyre = new Tyres();
        tyre.inflate();
        return tyre;
    }

    @Provides
    static Wheels provideWheels(Rims rim, Tyres tyre) {
        return new Wheels(rim, tyre);
    }
}
