package com.apps.nb2998.learningDagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    Engine engine;
    Wheels wheels;

    @Inject      // constructor injection
    Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "driving ");
    }
}
