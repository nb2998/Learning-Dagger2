package com.apps.nb2998.learningDagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {
//    private static final String TAG = "Car";
//    private Engine engine;
//    private Wheels wheels;
//
//    @Inject      // constructor injection
//    public Car(Engine engine, Wheels wheels) {
//        this.engine = engine;
//        this.wheels = wheels;
//    }
//
//    // can use field injection here too but prefer constructor wherever possible eg- members cant't be private
//    // field injection meant for frameworks that android instantiates like activities and fragments
//
//    public void drive() {
//        Log.d(TAG, "driving ");
//    }


    // METHOD INJECTION starts here
    // Order of execution Constructor -> Field -> Method

    private static final String TAG = "Car";
//    @Inject Engine engine; // 2nd this (field)
    private  Engine engine;
    private Wheels wheels;

    @Inject  //1st this (constructor)
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);  // as field injection executed 1st car object
    }

    public void drive() {
        Log.d(TAG, "driving ");
    }
}
