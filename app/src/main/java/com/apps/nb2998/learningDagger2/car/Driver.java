package com.apps.nb2998.learningDagger2.car;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton // error until do the same for component // 2 car instances in MainActivity, 2 have same driver for both
public class Driver {
    @Inject
    public Driver() {

    }
}

// If class doesn't come from inject but instead provides: singleton can also be used with provides
// Can also be used with binds but should not be used, as makes sense to use it with the Petrol engine like in PetrolEngineModule
