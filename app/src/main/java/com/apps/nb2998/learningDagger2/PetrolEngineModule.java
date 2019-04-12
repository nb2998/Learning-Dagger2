package com.apps.nb2998.learningDagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine provideEngine(PetrolEngine petrolEngine) {
        return petrolEngine;
    }
}
