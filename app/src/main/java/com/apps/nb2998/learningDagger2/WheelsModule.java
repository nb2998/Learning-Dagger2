package com.apps.nb2998.learningDagger2;

import dagger.Module;
import dagger.Provides;

@Module  // contribute to object graph via methods
public class WheelsModule {

    @Provides // should be made static when possible, like not possible when instance variable in the module
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tyres provideTyres(){
        Tyres tyre = new Tyres();
        tyre.inflate();
        return tyre;
    }

    @Provides
    static Wheels provideWheels(Rims rim, Tyres tyre){
        return new Wheels(rim, tyre);
    }
}
