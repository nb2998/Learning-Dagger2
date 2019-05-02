package com.apps.nb2998.learningDagger2.car;

import android.util.Log;

import com.apps.nb2998.learningDagger2.car.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {
//    private static final String TAG = "Car";
//
//    @Inject
//    public DieselEngine() {
//    }
//
//    @Override
//    public void drive() {
//        Log.d(TAG, "drive: Diesel engine started");
//    }



    // Till now, 3 ways to get objects in our dependency graph : inject, Modules (provides or binds)
    //  If we want to inject values at runtime :
    // Inject a variable horsepower over a constructor- @ Inject fails as dagger doesn't know where to get this hp value from

//    private static final String TAG = "Car";
//    private int horsepower;
//
//    public DieselEngine(int horsepower) {
//        this.horsepower = horsepower;
//    }
//
//    @Override
//    public void drive() {
//        Log.d(TAG, "drive: Diesel engine started");
//    }


//    Part 8 - Injecting the variable horsepower by making a provides method in Module

    private static final String TAG = "Car";
    private int horsepower;

    @Inject
    public DieselEngine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public void drive() {
        Log.d(TAG, "drive: Diesel engine started");
    }
}
