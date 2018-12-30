package com.apps.nb2998.learningDagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;

    @Inject      // constructor injection
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    // can use field injection here too but prefer constructor wherever possible eg- members cant't be private
    // field injection meant for frameworks that android instantiates like activities and fragments

    public void drive() {
        Log.d(TAG, "driving ");
    }
}
